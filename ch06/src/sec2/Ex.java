package sec2;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		String name;
		int kor;
		int eng;
		int mat;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		
		Student st = new Student(name, kor, eng, mat);
		System.out.println(st.calcTot());
		System.out.println(st.calcAvg());
		System.out.println(st.calcHak());
		System.out.println(st.calcRes());
		
		st.StudentEx();

	}

}
