package sec4;

public class Ex4 {
	public static void main(String[] args) {
		//랜덤수 : 아무수나
		int num1, num2;		//랜덤값 1, 2
		int sum = 0;		//합계
		boolean result = true;	//while 조건
		
		while(result) {
			num1 = (int) (Math.random()*6)+1;	//0~1까지의 아무 수
			num2 = (int) (Math.random()*6)+1;
			sum = num1 + num2;
			System.out.println("( " + num1 + ", " + num2 + " )");
			if(sum == 5){
				result = false;
			}
			
		}
	}

}
