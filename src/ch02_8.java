public class ch02_8 {
    public static void main(String[] args) {
        // 특수문자
//        System.out.println('  \'   '); // 에러인 이유 - 작은 따옴표는 공백 불가능
        System.out.println('\'');
        System.out.println("                   \'   ");
                                          // 큰 따옴표는 가능
        System.out.printf("abc\t123\b456");
                                // \t - 탭 한번 만큼 띄움

        System.out.printf("\n");
        System.out.printf("  \"Hello\"    %n");// 큰 따옴표 출력하는 방법
                                            //(" \"내용\" ") 큰 따옴표 쓰는 이유- 문자열이니까
        System.out.printf("\'H\' %n");      // 작은 따옴표 \' ~ \'

        System.out.printf("c:\\");
    }
}
