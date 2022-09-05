package sec1;
//1. 프로그램(Operation)의 모든 명령은 Op-code(연산자)와 Operand(피연산자)로 이루어짐
//a = a + b;
//+ : 연산(명령) -> Op-code
//a, b -> Operand 
//a, b는 주소가 2개 필요하기 때문에 제2주소 명령어 형식 이라 할 수 있다.
//명령 형식은 0~3까지, why? 컴퓨터는 64bit이기 때문에 

//2. 주소(기억장소의 개수)에 따라 0주소 명령어 형식 ~ 3주소 명령어 형식
//입력항에 따라 단항(unary) 연산과 이항(binay) 연산으로 분류됨 
//boolean a = true;
//boolean b = !a;	-> B에 저장되는 것은 false, !은 not, 피연산자가 하나일 경우 단한연산자라 할 수 있다.

//3. 연산의 종류에 따라 산술, 논리, 비교, 비트, 증감, 대입연산 등이 있음
public class Oper1 {

	public static void main(String[] args) {
		int a= 20, b = 30, c;
		System.out.println(a);
		prt();	//출력문만 가져오기 때문에 제 0주소 명령형식 이라 할 수 있다.
		c = a + b;
		//운용방식1 : +ab	-> pre(fix) order (전위)
		//운용방식2 : ab+	-> post(fix) order (후위)
		//운용방식3 : a + b -> in(fix) order(중위)
	}
	
	public static void prt() {
		System.out.println("data");
	}

}
