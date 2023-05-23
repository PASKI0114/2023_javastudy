package day12.com.ict.edu;

public class Ex08_Constuctor {
	private String name = "물";
	private int price = 500;
	
	//생성자
	//멤버필드를 
	public Ex08_Constuctor(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
