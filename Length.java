public class Length {
	public static void main(String[] args) {

    		String text = "Dewan Nadia Sultana Shumi";
		System.out.println(text.length());
		String newText = "";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != 'a') {
				System.out.print(text.charAt(i));
				newText = newText + text.charAt(i);
			}
		}

		System.out.print(newText.length());

	}

}

