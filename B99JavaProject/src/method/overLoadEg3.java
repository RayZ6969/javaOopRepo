package method;

public class overLoadEg3 {
	
	public static void proc() {
		for (int i = 1; i <= 45; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void proc(char ch) {
		for (int i = 1; i <= 45; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void proc(char ch, int a) {
		for (int i = 1; i <= a; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proc();
		proc('+');
		proc('=',20);

	}
}
