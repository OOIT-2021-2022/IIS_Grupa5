package geometry;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String args[]) {
		JFrame frame = new JFrame("Drawing");
		frame.setSize(800, 600);
		Drawing drawing = new Drawing();
		frame.getContentPane().add(drawing);
		frame.setVisible(true);
	}

	public void paint(Graphics g) {

		Point p = new Point(10, 20);
		p.draw(g);

		Shape shape = new Line(new Point(30, 40), new Point(50, 60));
		// Shape shape = new Shape();
		shape.draw(g);
		// System.out.println(shape.getStartPoint());
		if (shape instanceof Line) {
			System.out.println(((Line) shape).getStartPoint());
		}
		
		g.setColor(Color.red);
		Circle c = new Circle (new Point(50,50), 40);
		c.draw(g);
		
		g.setColor(Color.black);
		Rectangle r = new Rectangle(new Point(100,100),50,50);
		r.draw(g);
		
		//DOMACI - Zadatak 5

	}
}
