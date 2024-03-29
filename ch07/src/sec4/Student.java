package sec4;

public abstract class Student {
	String schoolname;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	//추상화된 메소드 : abstract가 기술되어 있는 메소드로서 반환타입 ,메소드명, 매개변수 등만 기술되어야 하며
	//구현내용은 기술하지 않고, 상속받는 서브 클래스에서 반드시 구현내용을 기술행 함
	abstract int computeTot(int jum1, int jum2, int jum3);
	abstract double computeAvg(int jum1, int jum2, int jum3);
	
	public String computeHak(int jum1, int jum2, int jum3){
		int tot = jum1 + jum2 + jum3;
		if(tot/3 >= 90){
			return "A";
		} else if(tot/3 >= 80){
			return "B";
		} else if(tot/3 >= 70){
			return "C";
		} else if(tot/3 >= 60){
			return "D";
		} else{
			return "F";
		}
	}
}
