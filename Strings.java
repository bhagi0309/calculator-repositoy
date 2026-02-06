package bha;

public class Strings {

	public static void main(String[] args) {
		String[] input1 = {"ab","cd","ef"};
		String[] input2 = {"af","ee","ef"};
		for(int i = 0; i < input1.length; i++) {
			String str1 = input1[i];
			String str2 = input2[i];
			if (str1.equals(str2) || str1.contains(str2) || str2.contains(str1)) {
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");
			}
		}
		// TODO Auto-generated method stub

	}

}
