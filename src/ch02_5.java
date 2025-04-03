public class ch02_5 {
    public static void main(String[] args) {
        //10,8,16 진수 표현
        //지시사 사용
        //글자수 [] 안에서의 표현


        String url = "www.codecobo.com";

        float f1 = .10f; //0.10, 1.0e-1
        float f2 = 1e1f; //10.0, 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d =1.2223456789;
        double e =21341.22239;

        System.out.printf("f1 = %f, %e , %g%n", f1,f1,f1);
        System.out.printf("f2 = %f, %e , %g%n", f2,f2,f2);
        System.out.printf("f3 =%f, %e , %g%n", f3,f3,f3);

        System.out.printf("d= %f%n",d);
        System.out.printf("d= %14.10f%n",d);// 전체 14자리 중 소수점 아래가 10자리
        System.out.printf("d= %10.10f%n",e);// 전체 14자리 중 소수점 아래가 10자리
/// /
        System.out.printf("[qefonqoiwhf]%n");
        System.out.printf("[%s]%n",url);
        System.out.printf("[%100s]%n",url);
        System.out.printf("[%-100s]%n",url);
        System.out.printf("[%.8s]%n",url);
    }
}
