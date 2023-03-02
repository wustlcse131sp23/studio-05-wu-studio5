package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	/**
	 * Compute the (Euclidean) distance between two points.
	 *
	 * @param x1 x-coordinate of a point
	 * @param y1 y-coordinate of a point
	 * @param x2 x-coordinate of another point
	 * @param y2 y-coordinate of another point
	 * @return the Euclidean distance between (x1,y1) and (x2,y2)
	 */
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		double xDistance= x2-x1;
		double yDistance= y2-y1;
		double distance= Math.sqrt((xDistance*xDistance)+(yDistance*yDistance));
		return distance;
	}

	/**
	 * Draw a bull's eye at the given location with the given radius.
	 *
	 * @param x      the x coordinate of the center of the bull's eye
	 * @param y      the y coordinate of the center of the bull's eye
	 * @param radius the radius of the bull's eye
	 */
	public static void drawBullsEye(double x, double y, double radius) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, radius);
		StdDraw.setPenColor(0,109,219);
		StdDraw.filledCircle(x, y, radius*0.75);
		StdDraw.setPenColor(146,0,0);
		StdDraw.filledCircle(x, y, radius*0.5);
		StdDraw.setPenColor(255,255,109);
		StdDraw.filledCircle(x, y, radius*0.25);

		

		// Yellow ring with 1.0/4.0 the radius
		// suggested rgb values: 255, 255, 109

		
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method
		for (int i=0; i<source.length(); i++) {
			if (source.charAt(i)==target) {
				result=result+replacement;
			}
			else {
				result=result+source.charAt(i);
			}
			}
		return result;
	}


	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		// FIXME: Compute the sum of the values in an array
		for (int i=0; i<values.length;i++)
		{
			sum = values[i]+sum;
		}
		return sum;
	}

	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = new int[length];
		for(int i=0; i<length; i++) {
			values[i]=value;
		}

		

		return values;
	}

	/**
	 * Return the mean of all the values of a previously filled array
	 * 
	 * @param value array filled with values
	 * @return mean of all values in the array
	 */
	public static double arrayMean(int[] value) {
		int sum=0;
		for (int i=0; i<value.length;i++)
		{
			sum = value[i]+sum;
		}
		double mean= (double) sum/value.length;
		return mean;
	}

	
}
