public class ch3_6_7_8 {
    public static void main(String[] args) {
        ///  연산자 연습
        byte a =10;
        byte b = 2;
        // byte c = a+b; ///에러남

        byte c = (byte)(a+b);
        System.out.println("예제 3-6 = "+c); //12

        byte a1 =10;
        byte b1 = 30;
        byte c1 = (byte) (a1*b1);
        System.out.println("예제 3-7= " + c1);
        /// 같은 형을 변환하였으니 300을 예상했겟지만
        /// byte의 범위가 -127~128까지 이므로 값 손실이 된 체 출력한다.

        int a2 = 1_000_000;
        int b2 = 2_000_000;
        long c2 = a2*b2;
        long c3 = (long)a2*b2;
        System.out.println("예제 3-8= " +c2);
        System.out.println("예제 3-8= " +c3);
    }
}
