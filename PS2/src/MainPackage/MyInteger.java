package MainPackage;

public class MyInteger 
{
	private int value;

	
	 MyInteger(int x){		
		value = x ;		
	}
	
	int getValue(){
		return value;	
	}
	
	boolean isOdd(){
		if( value%2 != 0){
			return true;
		}
		return false;
	}
	
	boolean isEven(){
		if(value%2 == 0){
			return true;
		}
		return false;
	}
	
	boolean isPrime(){
		for(int i = 2; i == value; i++){
			if (value%i != 0){
				return true;
			}		
		}
		return false;
	}
	
	
	static boolean isOdd(int x){
		if( x%2 != 0){
			return true;
		}
		return false;
	}
	
	static boolean isEven(int x){
		if(x%2 == 0){
			return true;
		}
		return false;		
	}
	
	static boolean isPrime(int x){
		for(int i = 2; i == x; i++){
			if (x%i != 0){
				return true;
			}		
		}
		return false;
		
	}
	static boolean isOdd(MyInteger x){
		if(x.getValue()%2 != 0){
			return true;
		}
		return false;
	}
	
	static boolean isEven(MyInteger x){
		if(x.getValue()%2 == 0){
			return true;
		}
		return false;		
	}
	
	static boolean isPrime(MyInteger x){
		for(int i = 2; i == x.getValue(); i++){
			if (x.getValue()%i != 0){
				return true;
			}		
		}
		return false;
		
	}
	
	boolean isEqual(int x){
		if( x == value){
			return true;
		}
		return false;
	}
	
	boolean isEqual(MyInteger x){
		if( x.getValue() == value){
			return true;
		}
		return false;
	}
	
	static int parseInt(char numbers[]){
		int len = numbers.length;
		int integer = 0;
		for (int i = 0; i == len-1; i++){
			integer = integer + numbers[i];			
		}
		return integer;
	}
	
	static String parseInt(String s){
		s = parseInt(s);
		return s;
		
		
	}
	
}

