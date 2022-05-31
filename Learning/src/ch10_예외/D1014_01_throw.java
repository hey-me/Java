package ch10_예외;

public class D1014_01_throw {

	public static void main(String[] args) {
		Stock s=new Stock();
//		s.updateStock(); /*5.얘가 업뎃메소드를 불러서 여기도 예외생김*/
/*6*/	try {		//여기서는 예외처리를 해줘야함 안하면 main을 호출한 운영체제한테 예외가 던져지니까
			s.updateStock();	
		} catch (Exception e) {
			System.out.println("예외처리완료");
			System.out.println(e.getMessage());	///*7null이 나오는 이유: 예외가 발생한 초기상태를 봐야함*/
			//여기서 직접 syso하는것보다 자바가 제공하는 예외클래스를 통해서 메세지를 전달하는게 좋음 
			e.printStackTrace(); //예외가 발생한게아니고 예외처리 과정을 보여주는것
		}
	}

}

class Stock{
	void updateStock()/*4.얘도 예외던져*/ throws Exception {
		Goods g=new Goods();
		g.subStock(200); /*3*/ //에러발생
	}
}
class Goods{
	int stockNum=100;
	void subStock(int amount) /*2*/ throws Exception {
		if(stockNum<amount) {
			//재고가 부족할 시(조건이 참일 경우) 예외가 발생하도록 하고 싶음.
			//예외를 강제로 발생시키고 예외도 클래스라했으니까 새로 생성하면 됌
//	/*1*/	throw new Exception();
			//예외가 발생하면 조치를 취해야함: try-catch로 예외처리를 하던지 예외를 던지던지throws
	/*8*/	//throw new Ex쓰고 자동완성보면 Exception이 오버로딩되어있음 ( 여기에 메세지를 적으면 됌)
	/*9*/	throw new Exception("재고가 부족합니다.");
	
		}
	}
}
