package sec2;

import java.util.Scanner;

public class Condition4 {
	public static void main(String[] args) {
		//점수를 입력받아 등급을 구하되, 등급은 90점 이상이면, "A", 80점 이상이라면, "B",
		//70점 이상이면, "C", 60점이상이면 "D", 그 밖의 점수는 "F"
		//상품은 등급이 "A"이면, "100년 묵은 산삼", "B" 이면, "한우갈비세트",
		//"C"이면, "백화점 상품권", "D" 이면, "문화상품권"으로 하며, "F"는 "한입만"
		/*switch (기준변수) {
		case value:
			실행문1;
			break;
		default:
			실행문n;
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int num = sc.nextInt();		//점수
		
		String rank ="";			//등급
		if(num >=90){
			rank = "A";
		} else if(num >= 80){
			rank = "B";
		} else if(num >= 70){
			rank = "C";
		} else if(num >= 60){
			rank = "D";
		} else {
			rank = "F";
		}
		
		String gift = "";			//상품
		switch (rank) {
			case "A":
				gift = "100년 묵은 산삼";
				break;
			case "B":
				gift = "한우갈비세트";
				break;
			case "C":
				gift = "백화점 상품권";
				break;
			case "D":
				gift = "문화상품권";
				break;
			default:
				gift = "한입만";
		}
		
		System.out.println("당신의 점수는 "+num+"점이며, 등급은 "+rank+"이고, 상품은 "+gift+"입니다.");
		sc.close();
	}

}
