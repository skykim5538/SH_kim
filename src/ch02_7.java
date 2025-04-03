public class ch02_7 {

    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;
        System.out.printf("%c=%d(%#X)%n", ch,code,code); //%d 10진수 표현, %c 문자로 출력 (문자를 문자로 출력)
                                                        // %#X  16진수로 표현 (# 때문에 앞에 16진수 기호를 붙음)
        char hch = '가';
        System.out.printf("%c=%d(%#x)%n",hch, (int)hch,(int)hch);

    }
}
