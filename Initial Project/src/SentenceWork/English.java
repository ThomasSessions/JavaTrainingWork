package SentenceWork;

class English {
	static String message;

	public void Print1(String msg) {

		String[] tempArray;

		String delimiter = " ";

		tempArray = msg.split(delimiter);

		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}
		for (int a = tempArray.length - 1; a >= 0; a--) {
			System.out.println(tempArray[a]);
		}
	}

	public void find(String what, String msg) {

		int counter = 0;
		String[] tempArray;
		String delimiter = " ";
		tempArray = msg.split(delimiter);
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i].equals(what)) {
				counter++;
			}
		}
		System.out.println("Counter value is: " + counter);
	}

	public void findAndReplace(String find, String replace, String msg) {
		String[] tempArray;
		String delimiter = " ";
		tempArray = msg.split(delimiter);
		for (int i = 0; i < tempArray.length; i++) {
			if (tempArray[i].equals(find)) {
				tempArray[i] = replace;
			}
		}

		msg = "";
		for (String word : tempArray) {
			msg += word + " ";
		}
		System.out.println(msg);
	}

	public void findAndReplaceChar(String find, String replace, String msg) {

		for (int i = 0; i <= msg.length() - find.length(); i++) {
			if (msg.substring(i, i + find.length()).equalsIgnoreCase(find)) {
				String beforeReplace = msg.substring(0, i);
				String afterReplace = msg.substring(i + find.length(), msg.length());
				msg = beforeReplace + replace + afterReplace;

			}
		}

		System.out.println(msg);
	}


	public static void main(String[] args) {
		String msg = "I am going to London";
		String what = "going";
		String find = "on";
		String replace = "***";
		English e = new English();
		e.Print1(msg);
		e.find(what, msg);
		e.findAndReplace(find, replace, msg);
		e.findAndReplaceChar(find, replace, msg);
	}
}