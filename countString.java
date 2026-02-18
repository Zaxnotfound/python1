public class countString {
public static void main(String[] args) {
	System.out.println("String counter");
	String name = "Batumbakal";
	System.out.println("the String to count vowels " + name);
	
	int vowelcounter = 0;

	for(int i = 0; i < name.length(); i++) {
	char character = name.charAt(i);
	
	if(character == 'a' || character == 'e' || 
                character == 'i' || character == 'o' || 
                character == 'u') {
	vowelcounter++;
	}
	}
System.out.println("there are " + vowelcounter + " in the word");
}
}