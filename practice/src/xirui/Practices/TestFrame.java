package xirui.Practices;

import javax.swing.JFrame;
import java.awt.*;

public class TestFrame {
	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setTitle("Window 1");
		frame1.setSize(200, 150);
		frame1.setLocation(200, 100);
		frame1.update(paint());
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);


		
	}

	public static Graphics paint() {
		Graphics g = null;
		g.setColor(Color.green);
		g.fillArc(10, 10, 60, 40, 30, 60);
		g.fillOval(10, 60, 60, 40);
		g.fillRect(80, 10, 60, 40);
		Polygon p = new Polygon();
		p.addPoint(150, 10);
		p.addPoint(210, 10);
		p.addPoint(210, 50);
		p.addPoint(150, 50);
		g.fillPolygon(p);   //绘制高度为5个像素，视角为45度正方向的3维矩形
		g.fill3DRect(150, 10, 60, 40, true);
		for (int i=1; i<=5; i++)
			g.draw3DRect(150 + i, 10 - i, 60, 40, true);
		//绘制高度为5个像素，视角为135度正方向的3维矩形
		g.fill3DRect(150, 60, 60, 40, true);
		for (int i=1; i<=5; i++)
			g.draw3DRect(150 - i, 60 + i, 60, 40, true);

		return g;
	}
}



