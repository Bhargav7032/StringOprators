package ReverseParticular;

public class reverse1 {
public static void main(String[] args) {
	String a1="panga Bhargav";
	String [] r=a1.split("//s");
	for(int i=0;i<r.length;i++) {
		String t=r[i];
		for (int j=t.length()-1;j>=0;j--) {
			System.out.println(t.charAt(j));
	}
		System.out.println(" ");
	}
	
	}
}

