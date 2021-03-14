
public class Points {
	int x,y,z;
	Points(){
		x = 0;
		y = 0;
		z = 0;
	}
	Points(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String StringTime() {
		StringBuilder sb = new StringBuilder("");
		sb.append("x: " + x + ",y: " + y + ", z: "+ z);
		String r = sb.toString();
		return r;
	}
}
