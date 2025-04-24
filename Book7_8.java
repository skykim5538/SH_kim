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
