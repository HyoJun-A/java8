package sec2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*Board(게시판)
글번호  숫자
글제목  문자
글내용  문자
작성자  문자
작성일  날짜

모든 멤버 필드는 게터/세터를 갖는다.

사용자 정의 메서드
	boardWrite(게시글 쓰기 작업) 은 글번호, 글제목, 글내용, 작성자, 작성일을 입력받아 저장한다.
	boardUpdate(게시글 수정 작업) 은 글번호, 글제목, 글내용 등을 매개변수로 받아 해당 글번호의 글을 수정할 수 있다.
	boardDelete(게시글 삭제 작업) 은 글번호를 입력받아 해당 글번호에 데이터를 삭제 또는 초기화할 수 있다.
	boardSearch(게시글 검색 작업) 글번호 등을 매개값으로 받아 해당 글번호에 글의 모든 내용을 출력할 수 있다.*/
public class Board {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	private int num;
	private String title;
	private String content;
	private String writer;
	private Date date;
	int number = 0;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void boardWrite(){
//		++number;
//		this.title = new String[number];
//		this.content = new String[number];
//		this.writer = new String[number];
		System.out.print("글번호를 입력해 주세요 : ");
		this.num = sc.nextInt();
		System.out.print("글제목을 입력해주세요 : ");
		this.title = sc.next();
		System.out.print("글내용을 입력해주세요 : ");
		this.content = sc.next();
		System.out.print("작성자를 입력해주세요 : ");
		this.writer = sc.next();
		Date date2 = new Date(); /* 오늘 날짜 */
		this.date = date2;
/*		try {	-> String형태의 날짜를 Date형식으로 변환 
            String str = sc.next();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date = format.parse(str);
            this.date = date;
        } catch(ParseException e) {
            e.printStackTrace();
        }
*/
	
	}
	 
	public void boardUpdate(int num, String title){
		if(this.num == num){
			this.title = title;
			System.out.print("수정할 내용을 입력해주세요 : ");
			this.content = sc.next();
			System.out.println("수정완료");
		} else if(this.num != num){
			System.out.println("글번호를 다시 확인해 주세요.");
		}
	}
	
	public void boardDelete(int num){
		if(num == this.num){
			System.out.println("글을 삭제 합니다.");
			this.title = null;
			this.content = null;
			this.writer = null;
			this.date = null;
		}
			
	}
	
	public void boardSearch(int num){
		if(num != this.num){
			System.out.println("글이 존재하지 않습니다.");
		} else{
			System.out.println("번호 : " + this.num);
			System.out.println("제목 : " + this.title);
			System.out.println("내용 : " + this.content);
			System.out.println("작성자 : " + this.writer);
			System.out.println("작성일 : " + this.date);
		}
		
	}
	
}
