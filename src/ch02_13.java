public class ch02_13 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;
        //byte 범위 -128~127

        System.out.println(i);
        System.out.printf("[int->byte] i=%d -> b= %d %n",i,b);

        i=300;
        b= (byte)i; // 300을 byte에 넣은 것.
                //10진수를 2진수로 표현 후, 값 손실을 적용된 값이 나옴
        System.out.printf("[int->byte] i=%d -> b= %d %n",i,b);

        b=10;
        i=(int)b;

        System.out.printf("[byte->int] b=%d -> i= %d %n",b,i);
            //10 10

        b=-2;
        i = (int)b;

        System.out.printf("[byte->int] b=%d -> i%d  %n", b, i);
         // b=-2 i = -2

        System.out.println("i=" + Integer.toBinaryString(i));

    }
}
