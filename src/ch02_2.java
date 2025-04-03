public class ch02_2 {

    public static void main(String[] args) {
        //x와 y값 바꾸기

        int x= 20, y=50;
        int tmp = 0;

        tmp = x;

        x=y;

        y=tmp;

        System.out.println("x="+x + "y="+y);

    }

}
