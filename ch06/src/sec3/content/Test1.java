package sec3.content;
//sec3 상위패키지, content 하위패키지
public class Test1 {
//	public > protected > default > private 
	/*
	다른 패키지에서 접근하는 경우 해당 클래스를 import 해야함
	public : 모든 패키지에서 접근 가능하며, 클래스/필드/생성자/메소드에 지정
	protected L 상속 관계에 있는 자식클래스 또는 같은 패키지에 있는 클래스에서 접근 가능하며, 필드/생성자/메소드에 지정 
	(단, 다른 패키지에 있는 자식클래스에서 접근할경우 super 키워드로 접근해야함)
	default :  같은 패키지에 있는 클래스에서 접근 가능하며 ,클래스/필드/생성자/메소드에 지정이 가능 지정시에는 접근제한자를 생략하면 지정됨
	private : 같은 클래스에서만 접근가능 ,필드/생성자/메소드에 지정이 가능
	*/
}
