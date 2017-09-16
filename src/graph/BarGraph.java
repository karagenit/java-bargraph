package graph;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BarGraph extends Applet {

	private static final long serialVersionUID = 1L;
	
	private double[] vals;

	public BarGraph() {
		vals = new double[0];
	}

	public BarGraph(double[] arr) {
		vals = arr.clone();
	}

	public void paint(Graphics g) {
		for(int i = 0; i < vals.length; i++) {
			g.fillRect(xbuff + (i * 20), ybuff, 10, (int)(vals[i] * 5));
			g.drawString(Integer.toString(i + 1), xbuff + (i*20), 15);
		}
		
		g.drawLine(0, ybuff, 500, ybuff);		
	}
	
	//STATIC LIB
	
	static int ybuff = 20;
	static int xbuff = 10;
	
	public static void render(double[] arr) {
		JFrame graph = new JFrame();
		
		graph.getContentPane().add((new BarGraph(arr)), BorderLayout.CENTER);
		graph.setSize(new Dimension(xbuff + 20 * (arr.length+1), 500));
		graph.setVisible(true);
	}
}
