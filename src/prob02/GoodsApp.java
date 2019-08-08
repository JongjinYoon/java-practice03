package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();//여기서 생성자를 만들지 않으면
			String info = scanner.nextLine();
			String[] data = info.split(" ");
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			int countStock = Integer.parseInt(data[2]);
			
			goods[i].setName(name);//여기서 객체가 널값을 가지기 때문에 널포인트 오류가 발생함
			goods[i].setPrice(price);
			goods[i].setCountStock(countStock);
		}
		for(int i = 0; i < COUNT_GOODS; i++) 
			System.out.println(goods[i].getName() + "(가격 : " + goods[i].getPrice() + "원)이 " + goods[i].getCountStock() + "개 입고 되었습니다.");
		
		scanner.close();
	}
}
