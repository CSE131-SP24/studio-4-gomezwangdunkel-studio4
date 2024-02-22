package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.25);
		StdDraw.setPenColor(133, 88, 237);
		StdDraw.filledRectangle(0.5,0.5,0.49,0.24);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.point(0.2, 0.6);
		StdDraw.point(0.8, 0.6);
		StdDraw.arc(0.5, 0.65, 0.2, 225, 315);
		
		
	}
	
	
	
}