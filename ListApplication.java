
public class ListApplication{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		String[] SList = new String[1];
		SquareClass[] SqList = new SquareClass[1];
		Points[] PList = new Points[1];
		
		FirstList FL = new FirstList(10);
		FL.addItem("how");
		FL.addItem("yay");
		FL.addItem("cool");
		FL.displayArray();
		
		/*FirstList FL2 = new FirstList(10);
		FL.addItem(3);
		FL.addItem(2);
		FL.addItem(1);
		System.out.println(FL.getItem(1));
		FL.displayArray();
		*/		
	}

}