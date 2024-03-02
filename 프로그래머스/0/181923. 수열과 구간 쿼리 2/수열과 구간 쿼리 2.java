class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer  = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			int item = -1; 
			
			for(int j = s; j <= e; j++) {
				if(arr[j] <= k)
					continue;
				
				if(item == -1 || item > arr[j]) {
					item = arr[j]; 
				}
			}
			answer[i] = item;
        }
        
        return answer;
    }
}