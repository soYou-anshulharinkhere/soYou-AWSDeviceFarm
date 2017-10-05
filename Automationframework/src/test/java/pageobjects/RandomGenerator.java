/* soYou Gyanmatrix Technologies pvt ltd.
 * created by kiran
 */
package pageobjects;

import io.appium.java_client.ios.IOSDriver;

import java.util.Random;

public class RandomGenerator {
	public RandomGenerator(IOSDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static String getNumber() {
		// public static void main String getNumber()){
		System.out.println("random number generation");
		Random obj = new Random();
		// create object for random class
		int rgen1 = obj.nextInt(999999999);
		// get random number with in the range of 0-10000000000
		String cellnum = Integer.toString(rgen1);
		cellnum = "1" + cellnum;
		System.out.println(cellnum);
		// if u want double random number use
		// obj.nextDouble();
		return cellnum;
	}

	/* select random number from a given range input */
	public static int getRowNumber() {
		System.out.println("random row number generation");
		Random obj = new Random();
		// create object for random class
		int rgen1 = obj.nextInt(10);
		// get random number with in the range of 0-10
		// String rownum =Integer.toString(rgen1);
		System.out.println(rgen1);
		// if u want double random number use
		// obj.nextDouble();
		return rgen1;
	}

	/* select random number from a given range input */
	public static int getRandomNumber(int i) {
		System.out.println("random row number generation");
		Random obj = new Random();
		// create object for random class
		int rgen1 = obj.nextInt(i);
		// get random number with in the range of 0-10
		// String rownum =Integer.toString(rgen1);
		System.out.println(rgen1);
		// if u want double random number use
		// obj.nextDouble();
		return rgen1;
	}
}