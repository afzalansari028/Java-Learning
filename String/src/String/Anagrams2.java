package String;

public class Anagrams2 {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "hello";
		boolean ret = isAnagrams(a,b);
		if(ret) {
       	 System.out.println("Anagrams");
        }
        else {
       	 System.out.println("Not anagrams");
        }
		
	}
		
//        String a = "abc";
//        String b = "cab";
    public static boolean isAnagrams(String a, String b) {
           
       boolean isAnagram = false;
        boolean visited[] = new boolean[b.length()];
        
        if(a.length() == b.length()) {
        	
        	for(int i=0; i<a.length(); i++) {
        		char c = a.charAt(i);
        		isAnagram = false;
        	
        	  for(int j=0; j<b.length(); j++) {
        		  if(b.charAt(j) == c && !visited[j]) {
        			  visited[j] = true;
        		    isAnagram = true;
        		    break;
        	      }
        	  }
        	  if(!isAnagram) {
        		break;
        	  }
          }
        }
        if(isAnagram)
        	return true;
        else
        	return false;
        			
        }
}
//        if(isAnagram) {
//        	System.out.println("Anagrams");
//        }
//        else {
//        	System.out.println("not Anagrams");
//        }
        
