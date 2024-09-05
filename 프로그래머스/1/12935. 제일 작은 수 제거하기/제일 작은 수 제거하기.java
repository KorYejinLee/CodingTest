class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int temp = arr[0];
        int index = 0;       
        
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arr.length - 1];
            for (int i = 1; i < arr.length; ++i) {
                if (temp > arr[i]) {
                    temp = arr[i];    
                }
            }
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] == temp) {
                   continue; 
                } else {
                    answer[index] = arr[i];
                    index++;
                }
            }
        }
        
        return answer;
    }
}