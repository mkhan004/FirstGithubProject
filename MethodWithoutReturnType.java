package abc;

public class MethodWithoutReturnType {

	public static void main(String[] args) {
		getRank(6007);
	}

	public static void getRank(int points) {
		if (points >= 600) {
			System.out.println("A");
		} else if (points >= 500) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
