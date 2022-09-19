package sec1;

public class MemberEx {
	public static void main(String[] args) {
		//클래스명 인스턴스명 = new 생성자함수();
		Member mem1 = new Member();
		mem1.setId("ahj");
		mem1.setPassword("1234");
		System.out.println("ID : "+mem1.getId());
		System.out.println("PW : "+mem1.getPassword());
		System.out.println("NAME : "+mem1.getName());
		
		Member mem2 = new Member("ahj", "1004");
		System.out.println("ID : " + mem2.getId());
		System.out.println("PW : " + mem2.getPassword());
		mem2.setName("이름");
		System.out.println("Name : " + mem2.getName());
		
		Member mem3 = new Member("nic", "4444", "nnn");
		System.out.println(mem3.getId()+ "\t"+mem3.getPassword()+ "\t"+mem3.getName());
		
		Member mem4 = new Member("aaa", "1111", "www", "adsa");
		System.out.println(mem4.getId()+ "\t" + mem4.getPassword()+ "\t"+mem4.getName()+ "\t"+mem4.getAddress());
		
		System.out.println("----------------------------------------------------------");
		//생성자의 매서드의 수와 동일하지 않으면 오류가 발생한다.
		//Member mem5 = new Member("as", "12", "aa", "bb", "cc");
		
		MemberContoller mc = new MemberContoller();
		mc.join("ahj", "1234", "안효준");
		mc.info();
		mc.login("ahj", "1234");
		mc.info();
	}

}
