
package  javaBro;

import java.security.SecureRandom;

public class JavaProject2 {

public static void main(String[] args) {
	
	SecureRandom random = new SecureRandom();

     StringBuilder password = new StringBuilder();	
    String characters =
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789" +
            "!@#$%^&*()-_=+[]{};:'\",.<>/?`~|";
    
    for(int i=0;i<12;i++) {
    	password.append(characters.charAt(random.nextInt(characters.length())));
    }
    System.out.println(password);
}
}