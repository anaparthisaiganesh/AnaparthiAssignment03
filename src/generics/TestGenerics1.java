package generics;

public class TestGenerics1{  
	  
	   public static < E > void printArray(E[] elements) {  
	        for ( E element : elements){          
	            System.out.println(element );  
	         }  
	         System.out.println();  
	    }  
	    public static void main( String args[] ) {  
	        Integer[] intArray = { 44, 55, 66, 77, 88 };  
	        Character[] charArray = { 'S', 'A', 'I', 'G', 'A','N','E','S','H' };  
	  
	        System.out.println( "Printing Integer Array" );  
	        printArray( intArray  );   
	  
	       System.out.println( "Printing Character Array" );  
	        printArray( charArray );   
	    }   
	}  
