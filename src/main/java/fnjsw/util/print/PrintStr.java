package fnjsw.util.print;

public class PrintStr {
	
	public PrintStr(float fx, float fy, String str){
		this.fx = fx;
		this.fy = fy;
		this.str = str;
	}
	
	private float fx;
	
	private float fy;
	
	private String str;

	public float getFx() {
		return fx;
	}

	public void setFx(float fx) {
		this.fx = fx;
	}

	public float getFy() {
		return fy;
	}

	public void setFy(float fy) {
		this.fy = fy;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}


}
