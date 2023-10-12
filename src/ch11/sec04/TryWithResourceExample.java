package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {

		try(Myresource res = new Myresource("A")) {  //A는 String 타입의 name
			String data = res.read1();
			int value = Integer.parseInt(data);  //value에 read1의 return값인 100을 넣어 줌 
		}catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		try(Myresource res = new Myresource("B")) {
			String data = res.read1();
			//NumberFormatException발생
			int value = Integer.parseInt(data); //value에 read2의 return값인 abc를 넣어 줌 -> abc는 숫자가 아니므로 예외 
		} catch (Exception e) {
			System.out.println("예외처리 :" + e.getMessage());
		}
		
		System.out.println();
		
		/*Myresource res1 = new Myresource("A");
		Myresource res2 = new Myresource("B");
		try(res1;res2) {
			System.out.println(res1.read1());
			System.out.println(res2.read2());
		} catch(Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		} */
	}

}
