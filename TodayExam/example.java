package TodayExam;

public class example {
	public static void main(String[] args) {
		String a1 = "1,2,3,-3,7,*10";
		String[] a2 = a1.split(",");
		int result = 0;

		for (int i = 0; i < a2.length; i++) {
			if (i < a2.length - 1) {
				int a = Integer.parseInt(a2[i]);
				result = result + a;
			} else {
				String s1 = a2[i];
				String s2 = a2[i].replace("*", "");
				int b = Integer.parseInt(s2);
				result = result * (b);
			}
		}
		System.out.println(result);
	}

}
