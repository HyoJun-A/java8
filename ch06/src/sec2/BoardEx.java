package sec2;

import java.util.Scanner;

public class BoardEx {
//	게시글 더미 데이터는 본인이 자유롭게 정보를 입력하되, 6건 이상 진행하되, 키보드로 입력받아 처리할 것.
//	작업번호 : 1[글쓰기], 2[글수정], 3[글삭제], 4[글검색] 작업이 각 각 진행되도록 할 것.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board bd = new Board();
		boolean run = true;
		int num;
		int wnum;
		String title;
		String content;
		while(run){
			System.out.print("1[글쓰기], 2[글수정], 3[글삭제], 4[글검색] 5[종료] : ");
			num = sc.nextInt();
			System.out.println("---------------------------------------------");
			
			switch(num){
				case 1:
					bd.boardWrite();
					System.out.println("---------------------------------------------");
					break;
				case 2:
					System.out.print("글번호 : ");
					wnum = sc.nextInt();
					System.out.print("글제목 : ");
					title = sc.next();
//					System.out.print("글내용 : ");
//					content = sc.next();
					bd.boardUpdate(wnum, title);
					System.out.println("---------------------------------------------");
					break;
				case 3:
					System.out.print("글번호 : ");
					wnum = sc.nextInt();
					bd.boardDelete(wnum);
					System.out.println("---------------------------------------------");
					break;
				case 4:
					System.out.print("글번호 : ");
					wnum = sc.nextInt();
					bd.boardSearch(wnum);
					System.out.println("---------------------------------------------");
					break;
				case 5:
					System.out.println("종료합니다.");
					run = false;
					break;
				default:
					System.out.println();
					System.out.println("번호를 다시 확인해 주세요.");
					System.out.println();
			}
		}

	}

}
