import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        if(1 <= a.length() && a.length() <= 10) {
            for(String s : a.split("")) {
                System.out.println(s);
            }
        }
    }
}