public class TaniaJaman {
    
	public static void main(String[] args) {
		String text = "My name is Shamima";
          System.out.println("This is my computer");

		System.out.println(getSubString(text));
	}

	public static String getSubString(String text) {
		String newText = "";
		for (int i = text.length() - 5; i < text.length(); i++) {
		newText = newText + text.charAt(i);
		}
		

		return newText;
	}

}

