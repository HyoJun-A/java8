package sec1;

import s2.Week;

//public : 현재 프로젝트내에서 다른 패키지에서도 접근 가능
//default : 접근 제한자를 생략했을 경우이며, 같은 패키지 내에서 접근 가능
//private : 현재 클래스 내부에서만 접근 가능
public class Member {
	//id, paswword, name, address, reg_date : 클래스의 멤버 필드(field)
	private String id;
	private String password;
	private String name;
	private String address;
	private String reg_date;
	
	//아래 부분은 기본 생성자(Constructor)로서 선언하지 않아도 자동으로 자바가 생성자를 묵시적으로 선언함
	public Member() {}
	
	
	//생성자(String, String)
	public Member(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	public Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public Member(String id, String password, String name, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
	}

	// 접근제한자 반환타입 메서드명([매개변수 타입매개변수명, ...]) { return 반환변수 | 값;}
	// 접근제한자 void 반환타입 메서드명([매개변수타입 매개변수명, ...]) { return 반환변수 | 값;}
	// 클래스의 멤버 메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
}
