package fnjsw.util.print;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaSizeName;

public class PrintUtil {

	public void print(List<PrintStr> psList, PrintSet pSet){
		LocatePrint lp = new LocatePrint(psList, pSet);
		lp.printContent();
	}
	
	public static void main(String [] args){
		// 字体
		Font font = new Font("宋体", Font.PLAIN, 24);
		// 颜色
		Color color = Color.black;
		// 纸张类型
		MediaSizeName media_size_name = MediaSizeName.ISO_A4;
		int pages = 1;
		PrintSet pSet =new PrintSet(font, color, media_size_name, pages);
		
		
		PrintStr ps1 = new PrintStr(100,200,"TestA");
		PrintStr ps2 = new PrintStr(200,300,"TestB");
		PrintStr ps3 = new PrintStr(300,400,"TestC");
		List<PrintStr> psList = new ArrayList<PrintStr> ();
		psList.add(ps1);
		psList.add(ps2);
		psList.add(ps3);
		
		PrintUtil pu = new PrintUtil();
		pu.print(psList, pSet);
	}
}
