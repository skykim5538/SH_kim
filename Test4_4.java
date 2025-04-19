public class Test4_4 {
    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {
//            for (int j = -1; j <= -100; j--) {
//                int sum = 0;
//                i +=i;
//                j +=j;
//                sum += i + j;
//
//                System.out.println(sum);
//
//            }
//        }
//        int j=0;
//        j +=1;
//        int sum=0;
//        while ( (sum += ++j) <=100){
//            System.out.printf("%d - %d%n", j,sum);
//        }
// ==============================================================================
//        int sum = 0;
//        while (sum >= 100) {
//            for (int i = 0; i <= 100; ++i) {
//                i += 1;
//
////                System.out.printf("%d%n", i);
//
//                for (int j = -1; j >= -100; --j) {
//                    j -= 1;
////                    System.out.printf("%d%n", j);
//
//
//                    sum += i + j;
//                    System.out.printf("%d%n", sum);
//
//                }
//            }
        /// ========================================================================================
//        int j = -1;
//        int i = 0;
//        int sum = 0;
//        while (sum >= 100) {
////
//            for (int i = 0; i <= 100; i += 1) {
//                for (int j = -1; j >= -100;  j -= 1) {
//
//                    sum += i + j;
//
//                    System.out.printf("%d%n", i);
//                    System.out.printf("%d%n", j);
//                    System.out.printf("%d%n", sum);
//                }
//
//            }
/// =============================================================================
//            for (int i = 1; i <= 10; i += 2) {
//
//                System.out.printf("%d%n", i);
//            }
//
//        for (int j = -2; j >=-10; j -= 2) {
//
//            System.out.printf("%d%n", j);
//        }

int i =1;
int j= -2;
int sum = 0;

while (sum<110)     {
    sum = i+j;
    System.out.printf("%d + %d = %d%n",i,j, sum);

    i += 2;
    j -= 2;
}





        }
    }
