package geometry;

import java.awt.Graphics;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;

	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint) && this.endPoint.equals(pomocna.endPoint))
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean contains(int x, int y) {
		return this.startPoint.distance(x, y) + this.endPoint.distance(x, y) - length() <= 2;
	}

	public boolean contains(Point clickPoint) {
		return this.startPoint.distance(clickPoint.getX(), clickPoint.getY())
				+ this.endPoint.distance(clickPoint.getX(), clickPoint.getY()) - length() <= 2;
	}

	public Point getStartPoint() {
		return this.startPoint; // ne sme poziv metode
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public double length() {
		return startPoint.distance(endPoint.getX(), getEndPoint().getX());
	}

	public String toString() {
		return startPoint + "-- >" + endPoint;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), 
				this.endPoint.getX(), endPoint.getY());
	}

}
