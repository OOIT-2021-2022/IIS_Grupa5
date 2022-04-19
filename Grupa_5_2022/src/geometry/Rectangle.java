package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape{
	private Point upperLeftPoint;
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {

		this(upperLeftPoint, width, height);
		this.selected = selected;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) && this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {
		return x >= upperLeftPoint.getX() &&
				x <= this.upperLeftPoint.getX() + width && 
				y >= upperLeftPoint.getY() &&
				y <= getUpperLeftPoint().getY() + height;
	}

	public boolean contains(Point clickPoint) {
		return clickPoint.getX() >= upperLeftPoint.getX() &&
				clickPoint.getX() <= this.upperLeftPoint.getX() + width && 
				clickPoint.getY() >= upperLeftPoint.getY() &&
				clickPoint.getY() <= getUpperLeftPoint().getY() + getHeight();
	}

	public int area() {
		return width * height;
	}

	public int circumference() {
		return 2 * (width + height);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}

	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}

	public String toString() {
		return "Upper left point:" + upperLeftPoint + ", width =" + width + ",height = " + height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeftPoint.getX(), upperLeftPoint.getY(), width, height);
		
	}
}
