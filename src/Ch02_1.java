public class Ch02_1     {
//변수 더하기
public static void main(String[] args) {
    int year =0;
    int age = 15;
    System.out.println(year);
    System.out.println(age);

    year=age+2000;
    age = age+1;
    System.out.println(year);
    System.out.println(age);


    // 96년생 나이 구하기

    int year1 = 1996;
    int cur_year = 2025;
    int cur_age = 0 ;

    System.out.println(year1);
    System.out.println(cur_year);

    cur_age = cur_year-year1;
    System.out.println(cur_age);


    // 앞에서 사용된 변수를 재 사용한다면, 가장 마지막에
    //지정한 변수에 값이 저장되는가>

    year = 12;
    System.out.println(year);

    // 가능함. 그러나 표기를 맞게 해야함
    // 그냥 변수 값만 넣으면 됨.
    // int year이라고 했으면, 다음엔 int 안쓰고 year만 쓰면 됨.

}





}
