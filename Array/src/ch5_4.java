public class ch5_4 {
    public static void main(String[] args) {
        int sum =0;     /// 총점을 저장하기 위한 변수
        float avr =0f;  /// 평균을 저장하기 위한 변수

        int[] score = {100,66,100,110,90};

        for (int i = 0 ; i<score.length ; i++) {
            sum += score[i];
        }
        avr = sum/ (float)score.length;
        /// float를 넣어주는 이유는, 평균의 소수점까지 구라기 위해사
        System.out.println(sum  );
        System.out.println(avr);

    }
}
