package sec4;

public class ShopService {
	private static ShopService service = new ShopService();
	static ShopService getInstance(){
		return service;
	}
}
