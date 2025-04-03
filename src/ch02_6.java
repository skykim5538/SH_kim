
import java.util.*; //스캐너 클래스를 사용하기 위해 추가해야함

public class ch02_6 {
    public static void main(String[] args) {
        //스캐너 연습
    Scanner scanner = new Scanner(System.in);

    System.out.print("두자리 정수를 하나 입력해주세요.>");
    String input = scanner.nextLine();
    int num = Integer.parseInt(input);

    System.out.println("입력 내용 : " + input);
    System.out.printf("num = %d%n",num);


    }
}
