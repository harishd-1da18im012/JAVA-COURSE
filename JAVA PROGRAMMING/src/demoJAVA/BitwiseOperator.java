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

    }
}
