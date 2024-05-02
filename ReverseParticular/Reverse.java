package ReverseParticular;

public class Reverse {
	public static void main(String[] args) {
		String s1="chiranjeevi";
		String [] r=s1.split("//s");
		for(int i=0;i<r.length;i++) {
			String t=r[i];
			for (int k=t.length()-1;k>=0;k--) {
				System.out.println(t.charAt(k));
		}
			System.out.println(" ");
		}

	}

}
