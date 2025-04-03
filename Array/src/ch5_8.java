import java.util.Arrays;

public class ch5_8 {
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));


        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(strArr[tmp]);
            //위에서 만들어진 랜덤의 수와 인덱스 번호의 배열이 들어가는 것
        }
    }
}
