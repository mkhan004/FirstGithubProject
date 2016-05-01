package abc;
public class NestedForLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("FirstLoop");
			for (int j = 1; j < 5; j++) {
				System.out.println("    SecondLoop");
			}
		}
	}
}
