package studio4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent = in.nextInt();
		System.out.println(shapeType);
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		StdDraw.setPenRadius(0.05);
		if (shapeType == "ellipse")
		{
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		System.out.println(parameterOne);
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		if (isFilled == false)
		{
			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		if (isFilled == true)
		{
			StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		}
		else if (shapeType == "rectangle")
		{
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();	
		}
		else if (shapeType == "triangle")
		{
			double parameterOne = in.nextDouble();
			double parameterTwo = in.nextDouble();
			double parameterThree = in.nextDouble();
			double parameterFour = in.nextDouble();	
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();	
			
		}
		
	}
}
