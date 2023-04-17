package Finally;

class Finally1 {    
	  public static void main(String args[]){    
	  try{    
	 
	   int d=20/5;    
	   System.out.println(d);    
	  }    
  
	  catch(NullPointerException e){  
	System.out.println(e);  
	}    
	 
	 finally {  
	System.out.println("finally block gets executed");  
	}    
	    
	System.out.println("finally");    
	  }    
	}    