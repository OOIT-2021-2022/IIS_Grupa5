package geometry;

import java.awt.Graphics;

public class Point extends Shape {

	/*
	 * public int x; public int y; public boolean selected;
	 */
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		setY(y);
	}

	public Point(int x, int y, boolean selected) {
		/*
		 * this.x=x; setY(y);
		 */
		// mora da bude prva naredba
		this(x, y);
		this.selected = selected;
	}

	public void draw(Graphics g) {
		g.drawLine(x - 2, y, x + 2, y);
		g.drawLine(x, y - 2, x, y + 2);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point pomocna = (Point) obj;
			if (this.x == pomocna.x && this.y == pomocna.y) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(int x, int y) {
		return this.distance(x, y) <= 2;
	}

	public boolean contains(Point clickPoint) {
		return this.distance(clickPoint.x, clickPoint.getY()) <= 2;
	}

	public double distance(int xPoint2, int yPoint2) {
		double dx = this.x - xPoint2;
		double dy = this.y - yPoint2;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		// ispravno ali mi ne zelimo tako
		// return String.valueOf(x);

		return "(" + x + "," + y + ")";
	}

}
