package sec4;

public class HighStudent extends Student {
	private int jum4;
	private int jum5;
	
	public int getJum4() {
		return jum4;
	}

	public void setJum4(int jum4) {
		this.jum4 = jum4;
	}

	public int getJum5() {
		return jum5;
	}

	public void setJum5(int jum5) {
		this.jum5 = jum5;
	}

	@Override
	int computeTot() {
		return jum1+jum2+jum3+jum4+jum5;
	}

	@Override
	double computeAvg() {
		return (float) (jum1+jum2+jum3+jum4+jum5)/5;
	}

	@Override
	public String computeHak() {
		int tot = jum1+jum2+jum3+jum4+jum5;
		if(tot/5>=90){
			return "A";
		} else if(tot/5>=80){
			return "B";
		} else if(tot/5>=70){
			return "C";
		} else if(tot/5>=60){
			return "D";
		} else {
			return "F";
		}
	}
}
