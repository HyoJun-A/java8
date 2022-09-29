package sec2;
//throws : 예외 떠넘기기
public class Throw1 {

	public static void main(String[] args) {
		String name = null;
		nullPassing(name);
		
		int[] arr = new int[3];
		arrayPassing(arr);
		
		String data = "kim1004";
		try{
			int vall = Integer.parseInt(data);
			System.out.println(vall);
		} catch(Exception e){
			e.printStackTrace();
		}

	}
	private static void arrayPassing(int[] arr) throws ArrayIndexOutOfBoundsException, NullPointerException{
		for(int i = 0; i < 5; i++){
			arr[i] = i*10;
		}
		
	}
	static void nullPassing(String data)throws NullPointerException{
		System.out.println(data);
	}
}
