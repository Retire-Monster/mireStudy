package java_basic;

public class D003_07_RandomInt {

	public static void main(String[] args) {

		double random = Math.random();
		int target = 0;

		target = (int) (random * 3);

		System.out.println(target);
	}

}