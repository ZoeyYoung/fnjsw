package fnjsw.util.print;

import java.awt.Color;
import java.awt.Font;

import javax.print.attribute.standard.MediaSizeName;

/**
 * 打印信息设置，如字体、颜色、纸张等
 *
 */
public class PrintSet {
	
	public PrintSet(Font font, Color color, MediaSizeName media_size_name, int pages){
		this.font = font;
		this.color = color;
		this.media_size_name = media_size_name;
		this.pages = pages;
	}
	
	private Font font;
	
	private Color color;
	
	private MediaSizeName media_size_name;
	
	// 页数
	private int pages;

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public MediaSizeName getMedia_size_name() {
		return media_size_name;
	}

	public void setMedia_size_name(MediaSizeName media_size_name) {
		this.media_size_name = media_size_name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
