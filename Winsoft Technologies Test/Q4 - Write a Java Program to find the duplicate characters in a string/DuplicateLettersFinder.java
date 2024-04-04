// This is Case Sensative

import java.util.Scanner;

public class DuplicateLettersFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        int count;
        char string[] = str.toCharArray();
        System.out.println("Duplicate characters in a given string: ");  
        
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    string[j] = '0';  
                }  
            }  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }
}

/*Output
Enter a string:
Hello how are you
Duplicate characters in a given string: 
e
l
o*/
