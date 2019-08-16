package controller;

public class StackOverflow {
	public static void main(String[] args) {
		// Stack Overflow
		//stack(1000000000);
		
		// Java heap space
		heap();
		
	
	}
	
	public static double stack(double n) {
		return stack(n+1);
	}
	
	public static void heap() {
		String a = "dsadjksabdhsdhsavdhasgvhauv";
		long i = 0;
		
		while(true) {
			i++;			
			a += a;
		}
	}
}
