# AlgorithmSpaceComplexity
determineTheSpaceComplexity in java code, by determine the bytecode size of the following Java program
and calculate the minimum RAM size required to run this Java program.


//Sample code here  Java program space complexity (method and static variable) .

public class Test {
    static int x = 11; //4bytes
    private int y = 33; // 4bytes
    
public void method1(int x) {
     // 12+4 = 16 bytes
    Test t = new Test();   //16+12 = 28 bytes
    this.x = 22;
    y = 44;
    
    System.out.println("Test.x: " + Test.x);
    System.out.println("t.x: " + t.x);
    System.out.println("t.y: " + t.y);
    System.out.println("y: " + y);
    
    }
    
public static void main(String[] args){
    Test t = new Test(); 4+8 =12 bytes
    t.method1(5);
    }
}

So, the complexity of this Java program is: 28 bytes.
