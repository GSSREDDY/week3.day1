package week3.day1;

public class Calculation {
	
	
	public void mul(int num1, int num2) {
		System.out.println(num1*num2);
		}
	public void mul(int num1, int num2, int num3) {
		System.out.println(num1*num2*num3);
		}
	
	
	
	public void sub(int num1, int num2) {
		System.out.println(num1-num2);
		}
	public void sub(int num1, int num2, int num3) {
		System.out.println(num1-num2-num3);
		}

	
	public void div(int num1, int num2) {
		System.out.println(num1/num2);
		}
	public void div(int num1, int num2, int num3) {
		System.out.println(num1/num2/num3);
		}
	
	
	public static void main(String[] args) {

		Calculation obj = new Calculation();
		obj.mul(20, 2);
		
		
		
		
		
		
		
		
		/*
		 * Calculation mul = new Calculation(); mul.mul(20, 2); mul.mul(1, 5, 2);
		 * Calculation sub = new Calculation(); sub.sub(30, 5); sub.sub(50, 30, 5);
		 * Calculation div = new Calculation(); div.div(50, 2);
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
