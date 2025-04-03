import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class ch5_3 {
    public static void main(String[] args) {
        int []iArr = {100,84,70,88,23};

        for (int i=0; i<iArr.length;i++) {
            System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr));
    }

}
