public class ch02_15 {
    public static void main(String[] args) {
        /// 정수 - 실수 간의 형변환
         int i = 91234567;
         float f = (float) i; // 91234567.0
         int i2 = (int) f ; // 91234567

        double d = (double) i; //91234567.0
        int i3 = (int)d; // 91234567
        float f2 = 1.666f; // 1.666
        int i4 = (int)f2; //1

        System.out.printf("i=%d%n",i); // i= 91234567
        System.out.printf("f=%f%n", f ); //f= 91234567.0
        System.out.printf("d=%f , i3=%d%n",d, i3); // d=91234567.0 , i3=91234567
        System.out.printf("(int)%f=%d%n", f2,i4); //(int)1.666 = 1

    }
}
