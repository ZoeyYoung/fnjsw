package fnjsw.util.print;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.List;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
* java定位打印，把打印内容打到指定的地方。
*
*/
public class LocatePrint implements Printable {
    // 需打印的结构体
    private List<PrintStr> psList;
    // 打印的基本信息
    private PrintSet pSet;

    public LocatePrint(List<PrintStr> psList, PrintSet pSet){
    	this.psList = psList;
    	this.pSet = pSet;
    }
    
    /**
     * Graphic指明打印的图形环境
     * PageFormat指明打印页格式
     * page指明页号
     */
    public int print(Graphics gp, PageFormat pf, int page) throws PrinterException {
        Graphics2D g2 = (Graphics2D) gp;
        g2.setPaint(pSet.getColor()); // 设置打印颜色为黑色
        g2.setFont(pSet.getFont());
        if (page >= pSet.getPages()) // 当打印页号大于需要打印的总页数时，打印工作结束
            return Printable.NO_SUCH_PAGE;
        g2.translate(pf.getImageableX(), pf.getImageableY());// 转换坐标，确定打印边界
        
        printStrList(g2);
        
        return Printable.PAGE_EXISTS; // 存在打印页时，继续打印工作
    }
    
    /**
     * 打印所有
     * 具体打印每一行文本，同时走纸移位
     */
    private void printStrList(Graphics2D g2){
    	for(PrintStr ps: psList){
    		g2.drawString(ps.getStr(), ps.getFx(), ps.getFy()); 
    	}
    }

    public void printContent() {
    	// 打印内容为空时
        if (psList != null && psList.size() > 0) 
        {
            // 指定打印输出格式
            DocFlavor flavor = DocFlavor.SERVICE_FORMATTED.PRINTABLE;
            // 定位默认的打印服务
            PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
            // 创建打印作业
            DocPrintJob job = printService.createPrintJob();
            // 设置打印属性
            PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
            // 设置纸张大小,也可以新建MediaSize类来自定义大小
            pras.add(pSet.getMedia_size_name());
            DocAttributeSet das = new HashDocAttributeSet();
            // 指定打印内容
            Doc doc = new SimpleDoc(this, flavor, das);
            // 不显示打印对话框，直接进行打印工作
            try {
                job.print(doc, pras); // 进行每一页的具体打印操作
            } catch (PrintException pe) {
                pe.printStackTrace();
            }
        } else {
            // 如果打印内容为空时，提示用户打印将取消
            JOptionPane.showConfirmDialog(null,
                    "Sorry, Printer Job is Empty, Print Cancelled!",
                    "Empty", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE);
        }
    }
} 