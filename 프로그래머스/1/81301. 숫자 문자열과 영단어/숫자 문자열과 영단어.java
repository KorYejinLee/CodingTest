class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] english_numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
       
        for(int i = 0; i <  english_numbers.length; ++i) {
            s = s.replaceAll(english_numbers[i], numbers[i]);    
        }
        
        int convert_s = Integer.parseInt(s);
        answer = convert_s;
        
        return answer;
    }
}