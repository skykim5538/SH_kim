public class ch02_9_overflow {
    public static void main(String[] args) {
        //오버플로우 연습
        short sMin = -32768;
        short sMax = 32767; // short의 범위 -32768~32767
        char cMin = 0;
        char cMax = 65535;

        int imax =2147483647;
        int imin =-2147483648;

        System.out.println("sMin ="+sMin);
        System.out.println("sMin-1 =" +(short)(sMin-1)); // short의 범우를 초과
                                            //그래서 -327689가 아니라 오버플로우로 32767이 된것
        System.out.println("sMax =  " + sMax);
        System.out.println("sMax +1 = "+ (short)(sMax+1));
        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin); //문자형의 증감 기호 -- ++
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax +1= " + (int)++cMax);
        System.out.println("iMax = " + (int)(imax+1) );
        System.out.println("iMin = " + (int)(imin-1) );

    }
}
