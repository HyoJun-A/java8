package sec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import sec1.Board;

public class ListEx3 {

	public static void main(String[] args) {
		List<Board> bList = new Vector<Board>();
		//글쓰기 - 요소 추가
		bList.add(new Board("제목1", "내용1", "글쓴이1"));
		bList.add(new Board("제목2", "내용2", "글쓴이2"));
		bList.add(new Board("제목3", "내용3", "글쓴이3"));
		bList.add(new Board("제목4", "내용4", "글쓴이4"));
		bList.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//글 목록
		System.out.println("제목\t내용\t글쓴이");
		for(int i =0; i < bList.size(); i++){
			Board b = new Board();
			b = bList.get(i);
			System.out.println(b.getTitle()+"\t"+b.getContent()+"\t"+b.getAuthor());
		}
		
		//글삭제 - 요소삭제
		bList.remove(0);
		
	}
}
