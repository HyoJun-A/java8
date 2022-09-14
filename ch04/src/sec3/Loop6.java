package sec3;

public class Loop6 {
	public static void main(String[] args) {
		//짝수, 홀수 반복문 제어
		//continue : 건너뛰기, break : 멈추기
		int tot = 0;
		for(int i = 0; i <= 100; i++){		//if문을 사용하여  홀수의 값은 실행하지 않는다.
			if(i%2 == 1) continue;
			tot += i;
		}
		System.out.println("0~100 짝수의 합계 : "+tot);
		
		tot = 0;
		for(int i=0; i <= 100; i+=2) {		//증감식을 i+=2로 정하여 0, 2, 4 .... 으로 i값에 대입한다.
			tot += i;
		}
		System.out.println("0~100 짝수의 합계2 : "+tot);
		
		tot = 0;
		for(int i=1; i<=100; i+=2){			//처음 값을 1로 초기화 하며, 증감식을 i+=2로 정하여 1, 3, 5 ...으로 i값에 대입한다.
			tot += i;
		}
		System.out.println("0~100 홀수의 합계 : "+tot);
		
		int n=1;
		tot = 0;
		for(; ;){							//무한루프문에서 if문을 사용하여 n의 값이 100을 초과할경우 break문을 사용하여 반복을 멈춘다.
			if(n>100) break;
			tot+=n;
			n+=2;
		}
		System.out.println("0~100 홀수의 합계2 : "+tot);
	}

}
