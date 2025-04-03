public class ch5_1 {
    public static void main(String[] args) {
//        int [] score ;
//        score = new int [5];

        ///  두 문장을 한문장으로 줄인면,
        /// 배열의 선언과 생성이 동시에

        int[] score = new int[5];
        score[3]  = 100;

        int value = score[3];

        System.out.println(value);

    }
}
