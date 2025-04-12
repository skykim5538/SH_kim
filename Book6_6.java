public class Book6_6 {
} ///메서드의 선언과 구현, 호출
                                /// *** 객체가 필요하므로 클래스를 사용한다.
class MyMath {                /// 내가 이 기능(메서드)을 사용하기 위해 정의할 것이다
    long add(long a,long b)      /// 매게변수 a와 b를 사용(선언)하여 아래와 같이 기능을 수행하게 할 것이다.
    {   long result = a+b;      /// 그 기능은, a+b한 값을 result 변수에 넣는 것이다. (이때 타입은 long을 사용한다. 반환타입이 같아야하므로)
        return result; }   /// 위 기능을 수행하였으면, 반환할 것이다.

    long subtract (long a, long b) {return a-b;} ///subtract 기능(메서드)를 사용하면, 이 값의 결과는 a-b를 반환하는 것이다.
    long multiply(long a, long b) {return a*b;}  /// multiply 기능(메서드)를 사용하면, 이 값의 결과는 a*b를 반환하는 것이다.
    double divide (double a,double b) { return a/b ;} /// divide 기능(메서드)를 사용하면, 이 값의 결과는 a/b를 반환하는 것이다.

}




class MyMathTest {
    public static void main(String[] args) {
        MyMath mm =new MyMath();
        long result1 = mm.add(6L, 2L);
        long result2 = mm.multiply(6L, 2L);
        long result3 = mm.subtract(6L, 2L);
        double result4 = mm.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}

