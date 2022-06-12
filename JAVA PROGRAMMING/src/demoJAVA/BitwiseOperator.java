package demoJAVA;

public class BitwiseOperator {
    public static void main(String[] args)
    {
        int a = 9;
        int b = 8;
 
        // bitwise and- (0,0)=0,(1,1)=1,(0,1)=0,(1,0)=0
        System.out.println("a&b = " + (a & b));
 
        // bitwise or- (0,0)=0,(1,1)=1,(0,1)=1,(1,0)=1
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor exclusive or- different values gets 1 and same value gets 0 i.e,(1,1)=0, (1,0)=1
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not complement operator- it inverts 0 to 1 and 1 to 0 of a value
        System.out.println("~a = " + ~a);
        
        //left shift operator- << it shifts right side value after decimal point to left side integer value
        System.out.println("<<shift operator is:"+(a<<3));
        
        //Right shift operator- >> it shifts left side value to after decimal point
        System.out.println(">>shift operator is:"+(b>>1));
        
        

    }
}
