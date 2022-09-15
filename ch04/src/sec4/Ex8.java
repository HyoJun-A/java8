package sec4;

public class Ex8 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		System.out.println("슈열 - 팩토리얼의 합계 출력");
		//결과 : 1! + 2! + ... 10!
		int mul = 1;
		int sum = 0;
		for(int i = 1; i <= 10; i++){
			for(int j = 1; j <= i; j++){
				mul *= j;
				sum += mul;
				System.out.print(mul + "\t");
			}
			System.out.println("--"+i);
			mul = 1;
		}
		System.out.println("결과 : " + sum);
	}

}
