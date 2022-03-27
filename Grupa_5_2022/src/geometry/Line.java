package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;

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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public double length() {
		return startPoint.distance(endPoint.getX(), getEndPoint().getX());		
	}

}