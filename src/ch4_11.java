import java.util.Scanner;

public class ch4_11 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호 뒷자리를 입력 하세요. -11112222");

        Scanner scanner =new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender= regNo.charAt(0);

        switch (gender) {
            case '1' : case '3' :
                switch (gender) {
                    case '1' :
                        System.out.println("당신은 00년 이전 출생의 남자입니다");
                        break;
                    case '3' :
                        System.out.println("당신은 00년 이후 출생의 남자입니다");

                        }
                        break; ///중첩 switch를 쓸 때 break는 괄호를 닫고 나온다.


                case '2' : case '4' :
                    switch (gender) {
                        case '2' :
                            System.out.println("당신은 00년 이전 출생의 여자입니다");
                            break;

                        case '4' :
                            System.out.println("당신은 00년 이후 출생의 여자입니다");

                    }
                    break;
                default:
                    System.out.println("유효하지않음");


                }

        }


    }

