public class ch02_4 {
    public static void main(String[] args) {
        //pintf 실습 =>소수점 구하기 가능, 자동 줄 바꿈 안됨

        byte b = 1;
        short  s = 5;
        char c  = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL; // long은 정수형인데 문자를 어떻게 쓰느냐


        int octnum = 010;
        int hexnum = 0x10;
        int binnum = 0b10;

       // System.out.println("b= %d%n", b); // 에러 print'ln'
        System.out.printf("b= %d%n", b); //%d = 10진수 형식, %n 줄바꿈
                                        //왜 , ln, f 차이 뭔데
        System.out.printf("s= %d%n",s);
        System.out.printf("c=%c, %d %n ", c, (int)c); //c를 문자형으로 출력하고, 10진수로 변황해라
        System.out.printf("fingrt = [%5d]%n",finger); // []안에 5자리로 finger를 표현하라
        //System.out.printf("fingrt = [%5d]%n",c); // 에러 - %d는 정수의 형식(10진수)으로 출력하느 것이므로
        System.out.printf("fingrt = [-+가나다%5d]%n",finger); // 앞에 있는 글자를 제외하고 5자리로 출력
        System.out.printf("fingrt = [%-5d]%n",finger);
        System.out.printf("fingrt = [%05d]%n",finger);  //빈칸을 0으로 채운다.
                                    // 그럼 0 말고 다른걸로 채우려면 어떻게 할 수 있을까?
        System.out.printf("big =%d%n", big); // 예상 100000000000

        System.out.printf("hex = %x%n", hex);
        System.out.printf("hex = %#x%n", hex);
        System.out.printf("hex = %#x%n, %x%n", hex , (int)hex); //0xFFFF_FFFF_FFFF_FFFFL;에 대한 숫자가 나와야하는 것 아닌가?

        System.out.printf("octnum =%o , %d%n",octnum, octnum); //%o 8진수로 나타내라 %d 10진수로 나타내라
        System.out.printf("hexnum =%x, %d%n", hexnum,hexnum);
        System.out.printf("binnum = %s, %d%n",Integer.toBinaryString(binnum),binnum);
            //10진수를 2진수로 변환해주는 지시사는 없으므로 추가 명령어 사용
            //정수를 2진수로 변환해주는 Integer.toBinaryString()
        System.out.printf("");

    }
}
