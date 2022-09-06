package sec2;

public class Cast1 {

	public static void main(String[] args) {
		int a = 1004, b;	//4byte
		short c, d;			//2byte
		long e = 100, f;	//8byte	
		byte g, h;			//1byte
		b = 65538;
//		c = a;	-> a는 int 이므로 short인 c에 데이터 전달이 안됨
		c = 500;
		a = c;	//c의 값이 short 타입이였지만 a에 대입하면서 int 타입으로 바뀐다, short -> int : 자동 형 변환 (auto casting)
		d = (short) b;	// (type) 변수 : 형 변환, 형 변화 연산자에 의한 형 변환 (force casting)
		System.out.println("d="+d);
		System.out.println("b="+b);
		/* e는 100*/
		e = b;
		/*e는 65538*/
		f = a + c;
		a = (int) (f + c);
	}

}