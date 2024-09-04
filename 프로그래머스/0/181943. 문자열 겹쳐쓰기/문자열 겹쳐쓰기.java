class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String first_string = my_string.substring(0,s);
        int overwrite_string_index = overwrite_string.length();
        String index_string = my_string.substring(overwrite_string_index+s);
        answer = first_string + overwrite_string + index_string;

        return answer;
    }
}