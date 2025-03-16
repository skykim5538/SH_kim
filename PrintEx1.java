package ch02;

public class PrintEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3); // 정수/정수는 정수값이 출력된다
		System.out.println(10.0/3); // 실수/정수는 실수값이 출력된다
		System.out.println(10/3.0); // 정수/실수도 실수값이 출력됨
		System.out.printf("%d",15);									
		System.out.printf("%o",15);								
		System.out.printf("%x%n",15);//줄바꿈을 해주는 개행문자(%n)의 유무 차이										
		System.out.printf("%d%n",15);									
		System.out.printf("%o%n",15);									
		System.out.printf("%x%n",15);	
		System.out.printf("%d%n",15);									
		System.out.printf("%#o%n",15);	//#을 추가하여 8진수 표현								
		System.out.printf("%#x%n",15);	//#을 추가하여 16진수
		System.out.printf("%s",Integer.toBinaryString(15));	//2진수
		System.out.printf("%n");	//공백 줄 띄우기
		
		
		
		float f=123.456789f;
		System.out.printf("%f%n",f); //float는 소수점 포함 7자리까지만 정밀도를 표현함.(뒤 숫자는 갯수로만 표현됨)
		double f1=123.456789;
		System.out.printf("%f%n",f1); //double는 15자리까지 정밀도를 표현함.
		System.out.printf("%e%n",f1); //f->e로 변경하여 출력값을 지수로 표현함.
		System.out.printf("%g%n",f1); //f->g로 변경하여 소주점 포함하여 7자리만 출력함
		System.out.printf("%n");	//공백 줄 띄우기
		
		System.out.printf("[%5d]%n",10);	//10을 []안에 5자리로 표현
		System.out.printf("[%-5d]%n",10);	//왼쪽 정렬로 10을 []안에 5자리로 표현
		System.out.printf("[%05d]%n",10);	//공백대신 0을 채워 10을 []안에 5자리로 표현
		System.out.printf("[%5d]%n",1534378654);
		System.out.printf("%n");	//공백 줄 띄우기
		
		double d =1.23456789;
		System.out.printf("%14.10f%n",d);	//14자리로 표현하는데, 소수점 기준으로 뒤에 10개의 숫자를 표현
											//나머지 앞은 4자리로, 공백으로
		System.out.printf("%14.6f%n",d);	//
		System.out.printf("%.6f%n",d);	//
		
		System.out.printf("%n");	//공백 줄 띄우기
		System.out.printf("[%s]%n","www.skykim.com");	//
		System.out.printf("[%20s]%n","www.skykim.com");	 //
		System.out.printf("[%-20s]%n","www.skykim.com");	//
		System.out.printf("[%.10s]%n","www.skykim.com");	//
		
	}

}
