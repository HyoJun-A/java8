package sec2;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int sum = 0;
	double avg = 0;
	String rank;
	String result;
	
	public Student(){}
	public Student(String name){
		this.name = name;
	}
	public Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int calcTot(){
		sum = kor + eng+ mat;
		return sum;
	}
	
	public double calcAvg() {
		avg = (double) Math.round(sum/3*100)/100;
		return avg;
	}
	
	public String calcHak() {
		if(avg >= 90){
			rank = "A";
		} else if(avg >= 80){
			rank = "B";
		} else if(avg >= 70){
			rank = "C";
		} else{
			rank = "D";
		}
		return rank;
	}
	
	public String calcRes(){
		if(avg >= 80){
			result = "합격";
		} else {
			result = "불합격";
		}
		return result;
	}
	
//	public void StudentEx(){
//		System.out.println("이름 : "+ this.name);
//		System.out.println("총점 : " + this.sum);
//		System.out.println("평균 : " + this.avg);
//		System.out.println("학점 : " + this.rank);
//		System.out.println("판정 : " + this.result);
//	}
	
	
}
