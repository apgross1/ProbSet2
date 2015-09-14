package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger(int intVal) {
		this.value = intVal;
	}
	
	public static int getInt(MyInteger intInstance) {
		return intInstance.value;
	}
	
	public boolean isEven() { 
		if (this.value % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	public boolean isOdd() { 
		if (this.value % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	public boolean isPrime() { 
		for (int i = 2; i < this.value; i++) {
			if (this.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int intVal) {
		if (intVal % 2 == 0) {
			return true;
		}
		else
			return false;
	}
	
	public static boolean isOdd(int intVal) {
		if (intVal % 2 == 0) {
			return false;
		}
		else
			return true;
	}
	
	public static boolean isPrime(int intVal) {
		for (int i = 2; i < intVal; i++) {
			if (intVal % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger classVal) {
		if (classVal.value % 2 == 0) {
			return true;
		}
		
		else
			return false;
	}
	
	public static boolean isOdd(MyInteger classVal) {
		if (classVal.value % 2 == 0) {
			return false;
		}
		
		else
			return true;
	}
	
	public static boolean isPrime(MyInteger classVal) {
		for (int i = 2; i < classVal.value; i++) {
			if (classVal.value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int intVal) {
		if (intVal == this.value) {
			return true;
		}
		else
			return false;
	}
	
	public boolean equals(MyInteger classVal) {
		if (classVal.value == this.value) {
			return true;
		}
		else
			return false;
	}
	
	public static int parseInt(char[] array) {
		String string_val = "";
		for (int i = 0; i < array.length; i++) {
			string_val += array[i];
		}
		
		int intVal = Integer.parseInt(string_val);
		return intVal;
	}
	
	public static int parseInt(String stringVal) {
		int intVal = Integer.parseInt(stringVal);
		return intVal;
	}
	
	public static void main(String[] args) {
		
	}
}