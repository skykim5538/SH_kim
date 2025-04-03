import java.util.Arrays;

public class ch5_7 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i =0; i<2;i++) {  //2번 섞겠다
                                    //numArr.length 배열  길이만큼 섞겠다.

            int n = (int)(Math.random()*10);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
            System.out.println(Arrays.toString(numArr));
        }
    }

}
