import java.util.Scanner;

public class ch4_2 {
    public static void main(String[] args) {
        int input;

        System.out.print("숫자입력.>");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); //스캐너에 입력된 값을 tmp에 저장
        input = Integer.parseInt(tmp); //tmp에 저장된 문자를 정수로 변환

        if (input == 0) {

            System.out.println("입력하신 숫자는 0입니다.");
        }
        if (input != 0)

            System.out.println("입력하신 숫자는 0이 아닙니다.");
            System.out.printf("입력하신 숫자는 %d입니다.", input);




    }


}
