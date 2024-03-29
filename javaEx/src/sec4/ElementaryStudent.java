package sec4;

public class ElementaryStudent extends Student{
	
	@Override
	public void Student(String name, int jum1, int jum2, int jum3) {
		this.name = name;
		this.jum1 = jum1;
		this.jum2 = jum2;
		this.jum3 = jum3;
	}

	@Override
	public String calcRes(){
		int avg = (jum1 + jum2 + jum3)/3;
		if(avg >= 90){
			return "합격";
		}else {
			return "불합격";
		}
	}
	
	@Override
	int computeTot() {
		return jum1+jum2+jum3;
	}

	@Override
	double computeAvg() {
		return (float) (jum1+jum2+jum3)/3;
	}
}