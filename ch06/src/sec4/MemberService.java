package sec4;

public class MemberService {
	String id;
	String password;
	
	public boolean login(String id, String password){
		if(id.equals("hong") && password.equals("12345")){
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id){
		if(id.equals("hong")){
			System.out.println(id+"님이 로그아웃 되었습니다.");
		} else {
			System.out.println("아이디를 다시 입력해 주세요");
		}
	}
}
