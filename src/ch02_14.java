public class ch02_14 {
    /// 캐스팅 (형변환)
    public static void main(String[] args) {
        float f =9.1234567f;
        double d= 9.1234567;
        double d2 = (double) f;
        System.out.printf("f=%20.18f\n",f);
                /// f를 20자리 중 소수점 아래로 18자리, 부족한 자리 수는 0으로
                //9.123456700000000000
        System.out.printf("d= %20.18f\n",d);
                /// d를 20자리 중 소수점 아래로 18자리, 부족한 자리 수는 0으로
                 //9.123456700000000000

        System.out.printf("d2 =%20.18f\n",d2);


        /// 실수 형변환 복습




    }

}
