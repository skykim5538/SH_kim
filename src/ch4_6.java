import java.util.Scanner;

public class ch4_6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int month  =scanner.nextInt(); ///입력한 숫자(문자)를 month에 정수로 받음

        switch (month) {
            case 3: case 4: case 5:     ///조건 연산자 [ : ]
                System.out.println("봄입니다");
            break;


            case 6 : case 7 : case 8 :
                System.out.println("여름 입니다");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("가을 입니다");
                break;


            default:
            case 12 : case 1 : case 2 :
                System.out.println("겨울 입니다");
                break;
        }



    }
}
