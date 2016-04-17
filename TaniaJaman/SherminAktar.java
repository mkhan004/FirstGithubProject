public class SherminAktar {
    public static void main(String[] args) {

		System.out.println(getResult("+", 3, 7));

	}

	public static String getResult(String type, int numOne, int numTwo) {
		String result = "";

		if (type == "+") {
			result = "Result: " + getSum(numOne, numTwo);
		} else if (type == "-") {
			result = "Result: " + getSubtraction(numOne, numTwo);
		} else if (type == "*") {
			result = "Result: " + getMultiplication(numOne, numTwo);
		} else if (type == "/") {
			if (numTwo == 0) {
				result = "Result: infinity";
			} else {
				result = "Result: " + getDivide(numOne, numTwo);
			}

		} else {
			System.out.println("Invalid Syntax");

		}

		return result;
	}

	public static int getSum(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public static int getSubtraction(int numOne, int numTwo) {
		return numOne - numTwo;
	}

	public static int getMultiplication(int numOne, int numTwo) {
		return numOne * numTwo;
	}

	public static int getDivide(int numOne, int numTwo) {
		return numOne / numTwo;
	}

}




