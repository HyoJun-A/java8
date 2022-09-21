package sec2;

public class ProductEx {
	//
	//ProductEx(제품관리)
	//예시 데이터 : a01, 냉장고, 3, 80000, icetank01.jpg 를 객체의 필드값으로 입력받아 제품의 입고 처리를 한다.
	//아이디, 제품명, 제품수량, 제품가격, 제품이미지을 출력하도록 한다.
	public static void main(String[] args) {
		Product pd = new Product("a01", "냉장고", 3, 80000);
		pd.setImg("icetank01.jpg");
		pd.printProduct();
		System.out.println("총 가격 : "+pd.calcMoney());
		System.out.println("제품 rank : " + pd.calcRank());

	}

}
