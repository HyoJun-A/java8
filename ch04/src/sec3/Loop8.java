package sec3;

public class Loop8 {
	public static void main(String[] args) {
		//이증 for문을 활용하여 아래와 같은 형태의 구구단을 출력 
/*		2*1=2,	3*1=3, .........9*1=9
		2*2=4,	3*2=6, .........9*2=18
*/	
		for(int i=1; i<10; i++){
			for(int j=2; j<10; j++){
				if(j != 9){
					System.out.print(j+"*"+i+"="+(i*j)+","+"\t");
				} else {
					System.out.print(j+"*"+i+"="+(i*j));
				}
				
			}
			System.out.print("\n");
			
		}
	}

}
