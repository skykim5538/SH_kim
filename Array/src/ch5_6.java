import java.util.Arrays;

public class ch5_6 {
    public static void main(String[] args) {
        int[] numArr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));
        /// ↑ 배열을 대괄호 안에 문자형으로 표현

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); //0~9 중 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        } //for문 끝
        System.out.println(Arrays.toString(numArr));

    }//main 끝

    }
