package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec1.Student;

public class ListEx2 {
	static List<Student> sList = new ArrayList<Student>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생리스트 선언
		boolean ck = true;
		int i = 0;
		while(ck){
			//작업번호 : 1.학생추가, 2.학생검색, 3.학생수정, 4.학생삭제, 5.학생명단
			System.out.println("1.학생추가, 2.학생검색, 3.학생수정, 4.학생삭제, 5.학생명단, 6.종료");
			System.out.print("작업 번호 선택 : ");
			int num = sc.nextInt();
			Student s = new Student();
			switch (num) {
				case 1:
					s.setNum(i);
					System.out.print("이름 : ");
					s.setName(sc.next());
					System.out.print("점수 : ");
					s.setJum(sc.nextInt());
					insert(s);
					break;
				case 2:
					System.out.print("학생검색  번호입력: ");
					int snum = sc.nextInt();
					s = select(snum);
					System.out.println(s.getNum());
					System.out.println(s.getName());
					System.out.println(s.getJum());
					break;
				case 3:
					System.out.print("학생 수정 ");
					int unum = sc.nextInt();
					s.setNum(unum);
					System.out.print("학생 이름 : ");
					s.setName(sc.next());
					System.out.print("학생 점수 : ");
					s.setJum(sc.nextInt());
					update(s);
					break;
				case 4:
					System.out.print("삭제할 학생 번호 : ");
					int dnum = sc.nextInt();
					s.setNum(dnum);
					delete(s);
					break;
				case 5:
					System.out.println("학생명단\n번호\t이름\t점수");
					for(int j=0; j < sList.size(); j++){
						Student r = new Student();
						r = sList.get(j);
						int coll = r.getNum();
						String col2 = r.getName();
						int col3 = r.getJum();
						System.out.println(coll + "\t" + col2 + "\t" + col3);
					}
					break;
				case 6:
					System.out.println("종료합니다.");
					ck = false;
					break;
				default:
					ck = true;
			}
			i++;
		}
		
	}
	static void insert(Student s){	//학생추가
		sList.add(s);
	}
	static Student select(int i){	//학생검색
		Student s = new Student();
		s= sList.get(i);
		return s;
	}
	static void update(Student s){	//학생수정
		Student t = new Student();
		t.setNum(s.getNum());
		t.setName(s.getName());
		t.setJum(s.getJum());
		sList.set(s.getNum(), t);
	}
	static void delete(Student s){	//학생삭제
		sList.remove(s.getNum());
	}
}
