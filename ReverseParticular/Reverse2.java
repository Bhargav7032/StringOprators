package ReverseParticular;

public class Reverse2 {
	public static void main(String[] args) {
		String p="gunnashaker";
		String [] e=p.split("//s");
		for(int i=0;i<p.length();i++) {
			String t=e[i];
			for (int j=t.length()-1;j>=0;j--) {
				System.out.println(t.charAt(j));
		}
			System.out.println(" ");
		}

	}

}
