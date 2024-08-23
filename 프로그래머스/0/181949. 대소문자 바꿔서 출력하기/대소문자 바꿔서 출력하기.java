import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        char[] charArray = a.toCharArray();
        
        for(int i = 0; i < charArray.length; ++i) {
            if(Character.isUpperCase(charArray[i])) {
                answer += String.valueOf(charArray[i]).toLowerCase();
            } else {
                answer += String.valueOf(charArray[i]).toUpperCase();
            }
        }
        
        System.out.print(answer);
    }
}