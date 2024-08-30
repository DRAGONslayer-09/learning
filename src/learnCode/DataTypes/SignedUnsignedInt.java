package learnCode.DataTypes;

public class SignedUnsignedInt {
    public static void main(String[] args) {
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("Signed integers: " + in1 + ", " + in2);
        int compareSignedNum = Integer.compare(in1, in2);
        System.out.println("Comparing signed numbers: " + compareSignedNum);
        int compareUnsignedNum = Integer.compareUnsigned(in1, in2);
        System.out.println("Comparing unsigned numbers: " + compareUnsignedNum);
            }
}
