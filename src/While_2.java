public class While_2 {
    public static void main(String[] args) {
        int num = 12345, sum=0;

        /// 10으로 나머지 연산을 하면 마지막 자리를 얻는다.

        while (num>0)   {
            sum+=num %10;
            System.out.println("sum="+sum+",num%10="+num%10);
            num=num/10;

        }
        System.out.println("각 마지막 자리 숫자의 합 "+sum);
    }
}
