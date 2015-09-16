//Andrew Gross
//CISC181


package MainPackage;

public class MyInteger {
	//Class attribute int
	private int value;
	
	
	public MyInteger(int intVal) {
	//Constructor method to create instance and set int value for attribute 
	//Parameters: intVal, an integer
	//Returns: N/A
		value = intVal;
	}
	
	
	public int getInt() {
		//Getter that returns the attribute value
		//Parameters: none
		//Returns: attribute value, an integer
		return this.value;
	}
	
	public boolean isEven() { 
		//Instance method; determines if value attribute of instance is even
		//Parameters: none
		//Returns: boolean
		if (this.getInt() % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	
	public boolean isOdd() { 
		//Instance method; determines if value attribute of instance is odd
		//Parameters: None
		//Returns: boolean
		if (this.getInt() % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	
	public boolean isPrime() { 
		//Instance method; determines if value attribute of instance is a prime number
		//Parameters: None
		//Returns: a boolean
		for (int i = 2; i < this.getInt(); i++) {
			if (this.getInt() % i == 0) {
				return false;
			}	
		}
		return true;
	}
	
	
	public static boolean isEven(int intVal) {
		//Static method; determines if int value is even
		//Parameters: intVal, an integer
		//Returns: a boolean
		if (intVal % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	
	public static boolean isOdd(int intVal) {
		//Static method; determines if int value is odd
		//Parameters: intVal, an integer
		//Returns: a boolean
		if (intVal % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	
	public static boolean isPrime(int intVal) {
		//Static method; determines if int value is prime
		//Parameters: intVal, an integer
		//Returns: a boolean
		for (int i = 2; i < intVal; i++) {
			if (intVal % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean isEven(MyInteger classVal) {
		//Static method; determines if value attribute of class instance is even
		//Parameters: classVal, an instance of MyInteger
		//Returns: a boolean
		if (classVal.getInt() % 2 == 0) {
			return true;
		}
		
		else
			return false;
	}
	
	
	public static boolean isOdd(MyInteger classVal) {
		//Static method; determines if value attribute of class instance is odd
		//Parameters: classVal, an instance of MyInteger
		//Returns: a boolean
		if (classVal.getInt() % 2 == 0) {
			return false;
		}
		
		else
			return true;
	}
	
	
	public static boolean isPrime(MyInteger classVal) {
		//Static method; determines if value attribute of class instance is prime
		//Parameters: classVal, an instance of MyInteger
		//Returns: boolean
		for (int i = 2; i < classVal.getInt(); i++) {
			if (classVal.getInt() % i == 0) {
				return false;
			}
		}
		return true;
	}
	

	public boolean equals(int intVal) {
		//Instance method; determines if an int argument is equal to the value of an instance of MyInteger
		//Parameters: intVal, an integer
		//Returns: boolean
		if (intVal == this.getInt()) {
			return true;
		}
		else
			return false;
	}
	
	
	public boolean equals(MyInteger classVal) {
		//Instance method; determines if the value of one instance of MyInteger is equal to another value of an instance of MyInteger
		//Parameters: classVal, an instance of MyInteger object
		//Returns: boolean
		if (classVal.getInt() == this.getInt()) {
			return true;
		}
		else
			return false;
	}
	
	
	public static int parseInt(char[] array) {
		//Static method; takes a char array and converts it to an int value
		//Parameters: array, an array of characters
		//Returns: accum, an integer that sums the numbers
		int accum = 0;
		for (int i = 0; i < array.length; i++) {
			String single = "";
			single += array[i];
			try {
			accum += Integer.parseInt(single);
			}
			catch(Exception NumberFormatException) {
				continue;
			}
		}
		
		return accum;
	}
	
	
	public static int parseInt(String stringVal) {
		//Static method; takes a string and converts it to an int value
		//Parameters: stringVal, a string
		//Returns: intVal, the integer value of stringVal
		String[] strArray = stringVal.split("");
		String accum = "";
		for (int i = 0; i < strArray.length; i++) {
			try {
				int testVal = Integer.parseInt(strArray[i]); //Dummy variable testVal
				accum += strArray[i];
			}
			catch(Exception NumberFormatException) {
				continue;
			}
		}
		int intVal = Integer.parseInt(accum);
		return intVal;
	}
	
	//Main method
	public static void main(String[] args) {
	
	}
}