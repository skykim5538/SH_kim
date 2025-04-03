import java.util.Scanner;

public class ch4_3 {
    public static void main(String[] args) {
        System.out.print(" 숫자 입력.>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); // 스캐너에 입력한 값을 정수 input의 값으로 받겠다.

        if (input == 0) {
            System.out.println("입력 숫자 0");
        }
            else {
            System.out.println("입력 숫자 0이 아닙니다");


        }


    }
}
