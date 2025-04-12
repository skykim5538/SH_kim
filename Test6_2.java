public class Test6_2 {
    public static void main(String[] args) {
        SutdaCrad card1 = new SutdaCrad(3,false) ;
        SutdaCrad card2 = new SutdaCrad() ;

        System.out.println(card1.info());
        System.out.println(card2.info());
//

    }
}
class SutdaCrad {
    int num;
    boolean isKwang;

    SutdaCrad () {
        this(1, true); //기본 값으로 1과 true를 가져와라
    }
    SutdaCrad(int num, boolean isKwang ) {
        this.num = num;
        this.isKwang = isKwang;  //외부의 값을 받아온 매개변수가 이 클래스의 값에 저장하라.
    }
        String info(){
            int num1 = num;
          String Kwang=  (isKwang)? "K" : "    ";   // boolean 논리형을 통해 이미 참/거짓이 결정된 채로 조건식에 들어간다.
                                                    //섯다 클래스에서 공백이면 true라고 준 값이 그 답이다.
            return num1+Kwang;

        }
    }





