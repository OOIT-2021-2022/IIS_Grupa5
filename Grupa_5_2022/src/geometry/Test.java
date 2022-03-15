package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		System.out.println(i);
		Point point1 = new Point();
		//System.out.println(point1.x+" "+point1.y+" "+point1.selected);
		
		System.out.println(point1.getX());
		point1.setX(15);
		System.out.println(point1.getX());
		
		point1.setY(25);
		System.out.println(point1.getY());
		point1.setSelected(true);
		System.out.println(point1.isSelected());
		
		
		System.out.println(point1.distance(30, 35));
	}

}
