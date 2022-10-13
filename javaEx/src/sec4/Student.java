package sec4;

public abstract class Student {
	String schoolname;
	String bun;
	String name;
	int jum1;
	int jum2;
	int jum3;
	
	
	
	public void Student(String name, int jum1, int jum2, int jum3) {}
	abstract int computeTot();
	abstract double computeAvg();
	public String computeHak(){
		int tot = jum1+jum2+jum3;
		if(tot/3>=90){
			return "A";
		} else if(tot/3>=80){
			return "B";
		} else if(tot/3>=70){
			return "C";
		} else if(tot/3>=60){
			return "D";
		} else {
			return "F";
		}
	}
	public String calcRes(){ return "";}
}
