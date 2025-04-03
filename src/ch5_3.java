public class ch5_3 {
    public static void main(String[] args) {


        int [] arr =new int[5];

        /// 위에서 배열의 길이(개수)를 5개로 지정하였다.
        /// 배열 arr에 1~5를 저장한다. (아래)
        for(int i=0 ; i< arr.length; i++)
        arr[i] = i+1;

        System.out.println("[변경전]");
        System.out.println("arr.length :" + arr.length);

        for(int i= 0 ; i< arr.length; i++)
            System.out.println("arr[" + i + "] :" + arr[i]);

        /// 이제 배열의 길이를 늘리겠다.

        int[] tmp = new int[arr.length*2]; ///*2로 길이를 두배 늘리겠다.

        /// 배열 arr에 저정된 값을들 tmp에 복사하겠다

        arr =tmp; ///tmp에 저장된 값을 arr에 저장한다.

        System.out.println("[변경후]");
        System.out.println("arr.length :" + arr.length);
        for( int i=0 ; i<arr.length; i++)
        System.out.println("arr[" + i + "] :" + arr[i]);


        System.out.println(arr.length);
    }
}
