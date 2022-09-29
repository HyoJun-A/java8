package sec1;

public class Exception2 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		int i = 0;
		while(i <= 3){
			try {
				arr[i] = i * 10 - 5;
				System.out.println(arr[i]);
				i++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배정된 배열의 요소수 보다 더많은 데이터를 요구하였음");
				e.printStackTrace();
				break;
			} catch (Exception e) {
				System.out.println("원인 불명의 예외 발생");
				e.printStackTrace();
				break;
			} finally{
				System.out.println("종료");
			}
			
		}
	}

}