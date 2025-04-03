import java.util.Scanner;

public class Swith_2 {
    public static void main(String[] args) {
        System.out.println("주민번호 입력하시오(000000-1111222).>");

        Scanner scanner = new Scanner(System.in);
        String regno = scanner.nextLine();

        char gender = regno.charAt(7);

        switch (gender) {

            case '1': case '3':
                switch (gender) {

                    case '1':
                        System.out.println("00년 이전 출생 남자");
                        break;

                    case '3':
                        System.out.println("00년 이후 출생 남자");
                        break;

                }
                break; ///여긴 브레이크가 밖에 있네

            case '2': case '4':
                switch (gender) {

                            case '2':
                                System.out.println("00년 이전 출생 여자");
                                break;

                            case '4':
                                System.out.println("00년 이후 출생 여자");
                                break; ///여긴 브레이크가 안에있고
                        }
                        break;
            default:
                System.out.println("유효하지 않은 번호");
                }

        }


}
