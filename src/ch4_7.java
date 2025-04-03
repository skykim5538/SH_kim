import java.util.Scanner;

public class ch4_7 {
    public static void main(String[] args) {
        System.out.print("가위 (1), 바위(2) 보(3) 중 하나 입력");

        Scanner scanner = new Scanner(System.in);
        int user    = scanner.nextInt();
        int com = (int) (Math.random()*3)+1;

        System.out.println("당신은 " + user + "입니다");
        System.out.println("컴은 " + com + "입니다");

        switch (user-com) {
            case 2: case -1:
                System.out.println("당신이 졌음");
                break;

            case 1: case -2 :
                System.out.println("당신이 이김");

                break;

            case 0:
                System.out.println("당신이 비김");
//
                break; ///생략 가능. 마지막 문장이라서


        }

    }
}
