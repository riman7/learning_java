public class BitManipulation {
    public static void main(String[] Args){
            //Note position are counted from last bit 

            //GET bit:
            // Bit Mask = 1<<i
            // Operation: AND....: If result = 0, bit is 0, else 1

            int n = 5; // 0101
            int pos = 4; // 4th bit from last, position = 3  (ie. 1st bit)
            int bitMask = 1 << pos;

            if((n & bitMask) == 0){
                System.out.println("Bit is 0");
            }
            else{
                System.out.println("Bit is 1");
            }

            //Set Bit:
            //Bit Mask = 1<<i
            //operation: OR
            n = n | bitMask;
            System.out.println(n);

            //Clear Bit:
            //Bit Mask = 1<<1
            //Operation: AND with NOT
            n = n & (~bitMask);
            System.out.println(n);

    }
    
}