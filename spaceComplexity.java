	
	public class spaceComplexity 
	{ 
	    static int x = 11; 
	    private int y = 33; 
	    public void method1(int x) 
	    { 
	    	spaceComplexity t = new spaceComplexity(); 
	        this.x = 22; 
	        y = 44; 
	  
	        System.out.println("Test.x: " + spaceComplexity.x); 
	        System.out.println("t.x: " + t.x); 
	        System.out.println("t.y: " + t.y); 
	        System.out.println("y: " + y); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	spaceComplexity t = new spaceComplexity(); 
	        t.method1(5); 
	    } 
	} 

