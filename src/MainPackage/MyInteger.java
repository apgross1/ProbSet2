package MainPackage;

public class MyInteger {
	//Class attribute 
	private int value;
	
	//Constructor method to create instance and set int value for attribute 
	public MyInteger(int intVal) {
		this.value = intVal;
	}
	
	//Getter that returns the attribute value
	public int getInt() {
		return this.value;
	}
	
	//Instance method; determines if value attribute of instance is even
	public boolean isEven() { 
		if (this.getInt() % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	//Instance method; determines if value attribute of instance is odd
	public boolean isOdd() { 
		if (this.getInt() % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	//Instance method; determines if value attribute of instance is a prime number
	public boolean isPrime() { 
		for (int i = 2; i < this.getInt(); i++) {
			if (this.getInt() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Static method; determines if int value is even
	public static boolean isEven(int intVal) {
		if (intVal % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	//Static method; determines if int value is odd
	public static boolean isOdd(int intVal) {
		if (intVal % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	//Static method; determines if int value is prime
	public static boolean isPrime(int intVal) {
		for (int i = 2; i < intVal; i++) {
			if (intVal % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Static method; determines if value attribute of class instance is even
	public static boolean isEven(MyInteger classVal) {
		if (classVal.getInt() % 2 == 0) {
			return true;
		}
		
		else
			return false;
	}
	
	//Static method; determines if value attribute of class instance is odd
	public static boolean isOdd(MyInteger classVal) {
		if (classVal.getInt() % 2 == 0) {
			return false;
		}
		
		else
			return true;
	}
	
	//Static method; determines if value attribute of class instance is prime
	public static boolean isPrime(MyInteger classVal) {
		for (int i = 2; i < classVal.getInt(); i++) {
			if (classVal.getInt() % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Instance method; determines if an int argument is equal to the value of an instance of MyInteger
	public boolean equals(int intVal) {
		if (intVal == this.getInt()) {
			return true;
		}
		else
			return false;
	}
	
	//Instance method; determines if the value of one instance of MyInteger is equal to another value of an instance of MyInteger
	public boolean equals(MyInteger classVal) {
		if (classVal.getInt() == this.getInt()) {
			return true;
		}
		else
			return false;
	}
	
	//Static method; takes a char array and converts it to an int value
	public static int parseInt(char[] array) {
		String string_val = "";
		for (int i = 0; i < array.length; i++) {
			string_val += array[i];
		}
		
		int intVal = Integer.parseInt(string_val);
		return intVal;
	}
	
	//Static method; takes a string and converts it to an int value
	public static int parseInt(String stringVal) {
		int intVal = Integer.parseInt(stringVal);
		return intVal;
	}
	
	//Main method
	public static void main(String[] args) {

	}
}