package geometry;

public class Test {

	public static void main(String[] args) {
		// Vezbe 2

		int i = 0;
		System.out.println(i);
		Point point1 = new Point();
		// System.out.println(point1.x+" "+point1.y+" "+point1.selected);

		System.out.println(point1.getX());
		point1.setX(15);
		System.out.println(point1.getX());

		point1.setY(25);
		System.out.println(point1.getY());
		point1.setSelected(true);
		System.out.println(point1.isSelected());

		System.out.println(point1.distance(30, 35));

		// Vezbe 3
		Point startPoint = new Point();
		System.out.println(startPoint.getX());
		System.out.println(startPoint.getY());
		System.out.println(startPoint.isSelected());

		// startPoint.x=10;
		startPoint.setX(10);
		startPoint.setY(20);
		System.out.println(startPoint.getX());
		System.out.println(startPoint.getY());

		Point endPoint = new Point();
		endPoint.setX(15);
		endPoint.setY(25);

		Line line1 = new Line();
		System.out.println(line1.isSelected());
		System.out.println(line1.getStartPoint());
		// System.out.println(line1.getStartPoint().getX());
		line1.setStartPoint(startPoint);
		line1.setEndPoint(endPoint);
		System.out.println(line1.getStartPoint().getX());
		System.out.println(line1.length());

		// p je startPoint a p1 je endPoint

		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1

		startPoint.setX(endPoint.getY());

		// 2. Postaviti y koordinatu krajnje tacke l1 na 23

		line1.getEndPoint().setY(23);

		// 3. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1

		line1.getStartPoint().setX(line1.getEndPoint().getY());

		// 4. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1

		line1.getEndPoint().setX((int) line1.length() - (line1.getStartPoint().getX() + line1.getStartPoint().getY()));

		// 5. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15

		Rectangle r1 = new Rectangle();
		r1.setUpperLeftPoint(startPoint);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);

		// 6. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1

		Circle c1 = new Circle();
		c1.setCenter(r1.getUpperLeftPoint());

		// 7. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		c1.getCenter().setX(r1.area() - line1.getStartPoint().getY());

		// Vezbe 4
		/*
		 * 1.Postaviti koordinatu x centra ranije kreiranog kruga k na vrednost zbira
		 * vrednosti poluprecnika kruga k i vrednosti koja predstavlja udaljenost
		 * pocetne i krajnje tacke prethodno kreirane linije lin (NE duzine). Sve
		 * objekte kreirati samostalno.
		 */

	}

}
