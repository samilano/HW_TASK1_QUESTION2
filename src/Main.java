/*
 * QUESTION: Whats wrong with the given code below? 
 * 
 * ANSWER: 
 * 1. Java strings are objects, so it's not good to compare them with:
 * if(wordToCheck == "hostleworld" )
 * Instead they should be compared with ".equals()", i.e.:
 * if(wordToCheck.equals("hostleworld"))
 * 
 * 2. fixSpelling is a recursive method, but it doesn't have defined ending point 
 * nor a constant progression towards that ending point. In a given case, because of that, whenever
 * else branch is reached it will end up in infinite loop
*/


public class Main {
	public static void main(String[] args) {
		System.out.println(fixSpelling("hostleworld"));
	}
	
	public static String fixSpelling(String name) {
		String wordToCheck = new String(name);
		if(wordToCheck == "hostleworld" ) {
			name = "hostelworld";
		} else {
			fixSpelling(name);
		}
		return name;
	}
}
