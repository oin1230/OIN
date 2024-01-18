package 자바페최종;

public class Jb2 {
	
	public static void main(String[] args) {
		
		System.out.println(getMiddle("passward"));
	}

	public static String getMiddle(String str) {
		
		if(str.length()%2 == 0) {
			return ""+str.charAt(str.length()/2-1) + str.charAt(str.length()/2); 
		} else {
			return ""+str.charAt(str.length()/2);
		}
	}
	
	
	
}
