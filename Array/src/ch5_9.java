public class ch5_9 {
    public static void main(String[] args) {
        int [][] score = {
                {100, 100, 100},
                {20, 20, 20, 20},
                {30, 30,},
                {40, 40, 40}
        };
        int sum = 0;

        for (int i=0; i<score.length; i++) {  ///   배열의 길이만큼 1을 더하겟다.
            for (int j=0; j<score[i].length; j++) {  ///  배열 중 i의 길이만큼 더해겠다.
                System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);

                sum +=score[i][j];

            }
        }
        System.out.printf("sum=" + sum);
    }
}
