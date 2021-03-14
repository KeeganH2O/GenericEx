
public class SquareClass {
	private double side, area;
	SquareClass(){
		this.side = 0;
		this.area = 0;
	}
	SquareClass(int side) {
		this.side = side;
		this.area = side *side;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("side: "+side+"area: " +area);
		String r = sb.toString();
		return r;
	}
	
	//getters and setters
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
}
