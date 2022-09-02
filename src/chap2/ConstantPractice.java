package chap2;


public class ConstantPractice {
	
	static final int cars = 50;
	static int wheels = 20;
	public static int seats = 5;

	public static void main(String[] args) {
		
		System.out.println("Here is my wheel value: " + wheels);
		wheels = wheels + 10;
		System.out.println("Here is my wheel value after adding 10: " + wheels);
		
		System.out.println("Here is my seat value: " + seats);
		seats = seats + 1;
		System.out.println("Here is my seat value after adding 1: " + seats);
		
		{
			int seats = 6;
			System.out.println("Here is my seatvalue in an inner block: " + seats);
			
		}
		
	}

}
