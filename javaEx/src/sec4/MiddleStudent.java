package sec4;

public class MiddleStudent extends Student {
	private int jum4;

	public int getJum4() {
		return jum4;
	}

	public void setJum4(int jum4) {
		this.jum4 = jum4;
	}

	@Override
	int computeTot() {
		return jum1+jum2+jum3+jum4;
	}

	@Override
	double computeAvg() {
		return (float) (jum1+jum2+jum3+jum4)/4;
	}

	@Override
	public String computeHak() {
		int tot = jum1+jum2+jum3+jum4;
		if(tot/4>=90){
			return "A";
		} else if(tot/4>=80){
			return "B";
		} else if(tot/4>=70){
			return "C";
		} else if(tot/4>=60){
			return "D";
		} else {
			return "F";
		}
	}
	
}
