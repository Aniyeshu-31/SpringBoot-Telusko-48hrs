import java.lang.Math;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        int num1bin = 0b1000; // Binary Number;
        int num2hex = 0x7E; // Hexadecimal number
        int num3 = 10_00_00_000; // to easily count the number of Zeros
        double num4 = 1e9; // to store a very large number
        char c = 'a';
        c++;
        System.out.println(c);

        int a = 257;
        byte b = (byte) a; // byte range is -> -128 to 127 total 256 ->
        // converting integer to byte it will divide the integer value by range of byte
        // in
        // this case a % 256 which is equal to 257 % 256 = 1;
        System.out.println(b);

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : nums) {
            for (int m : n) {
                System.out.print(m);
            }
            System.out.println();
        }
        // jagged Array

        int jagged[][] = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[5];
        
        for(int i = 0;i < jagged.length;i++) {
            for(int j = 0;j < jagged[i].length;j++){
                jagged[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i = 0;i < jagged.length;i++) {
            for(int j = 0;j < jagged[i].length;j++){
                System.out.print(jagged[i][j]);
            }
            System.out.println();
        }


        // Strings 

        String name = "navin";
        name = name +" reddy";
        System.out.println("hello "+name);
        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2); // returns true since address is same.


        // String Buffer and StringBuilder helps to create Mutable Strings
        // String Buffer is Thread safe while String Builder is not.
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
       
         // to load class only not to instantiate its object
       Class.forName("Mobile");
    }

}
