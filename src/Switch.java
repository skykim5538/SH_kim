import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("현재 월 입력.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄입니다");

            default:
            case 12: case 1:case 2:
                System.out.println("겨울입니다");


        }


    }
}
