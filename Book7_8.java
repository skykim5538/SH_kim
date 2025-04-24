public class Book7_8 {
    public static void main(String[] args) {
        Point3D1 p3 = new Point3D1();
        System.out.println(p3.x);

        System.out.println(p3.y);
        System.out.println(p3.z);
    }
}

class point1 {

    int x = 10;
    int y =20;
    point1(int x, int y) {
        this.x = x;
        this.y=y;

    }
}
class Point3D1 extends point1 {
    int z =30;
    Point3D1 () {
        this(100,200,300);
    }

    Point3D1 (int x, int y, int z) {
        super(x,y);
    this.z=z;
    }
}

// 생성자 super ( )는 같은 멤버수를 가진 조상의 생성자로 들어간다.  
 //자식 클래스에서 super(...)를 호출할 때는, 부모 클래스의 생성자 중 인자의 타입과 개수가 일치하는 가장 명확한 것을 호출하게 됩니다.
