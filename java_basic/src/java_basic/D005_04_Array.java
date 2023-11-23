package java_basic;

public class D005_04_Array {

	public static void main(String[] args) {
		// ¹è¿­
		
		int[] a = new int[10];
		
		System.out.println(a[4]);
		
		a[4] = 100;

		System.out.println(a[4]);
		
		for (int i = 0;i<a.length;i++) {
			a[i]=i+1;
			
		}
	}

}
