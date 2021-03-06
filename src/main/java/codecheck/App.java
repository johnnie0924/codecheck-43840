package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = check(args[i]);
			System.out.println(output);
		}
	}

	public static String check(String inStr) {
		String result = "";
		try {
			int inInt = Integer.parseInt(inStr);

			if (inInt > 1000 || inInt < 0 || inStr.contains("０") || inStr.contains("０") || inStr.contains("１")
					|| inStr.contains("２") || inStr.contains("３") || inStr.contains("４") || inStr.contains("５")
					|| inStr.contains("６") || inStr.contains("７") || inStr.contains("８") || inStr.contains("９")) {
				result = "invalid";
			} else if (inInt % 3 == 0 && inStr.contains("3")) {
				result = "dumb";
			} else if (inInt % 3 == 0) {
				result = "idiot";
			} else if (inStr.contains("3")) {
				result = "stupid";
			} else {
				result = "smart";
			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
			result = "invalid";
		}

		return result;
	}
}
