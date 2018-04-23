package common;

import java.util.Random;

public class RandomGenerator {
	

public static String generateNumber(){
    System.out.println("random number generation");
    Random obj = new Random();
    // create object for random class
    int rgen1 = obj.nextInt(1000000);
    // get random number with in the range of 0-1000
    String cellnum = Integer.toString(rgen1);
  //  System.out.println(cellnum);
    return cellnum;
    // if u want double random number use
   // obj.nextDouble();
  }

     public static void main(String[] args){
    	
    	generateNumber();
    	String EmailId="anshul12@gmail.com";
    	 String[] emailf=EmailId.split("@");
    	 System.out.println(emailf[0]);
    	 System.out.println(emailf[1]);
    	 
     }
}


