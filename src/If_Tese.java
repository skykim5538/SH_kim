import java.util.Scanner;

public class If_Tese {
    public static void main(String[] args) {
        int score = 0;
        char grade =' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); ///화면에 적은 값을 scanner로 받음

        System.out.printf("점수는 %d입니다. %n", score);


        if (score >= 90) {  /// 스캐너에 입력된 값이 90점이상인가?
            grade = 'A';
            if (score >= 98) { /// 90점이상이면서, 98점이상인가?
                opt = '+';
            }else if (score < 94) { /// 90점이상이면서, 94점미만인가?
                    opt = '+';
                }

            }
        else if (score >= 80) { /// 스캐너에 입력된 값이 90점 미만이면서 80점 이상인가?
                grade = 'B';
                if (score >= 88) { ///
                    opt = '+';
                } else if (score < 84) {
                    opt = '+';
                }

            }
        else {
                grade = 'C';
            }

        System.out.printf("학점은 %c%c입니다.%n", grade, opt);

        }
    }
