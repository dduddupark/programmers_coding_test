class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int a = (int) Math.sqrt(n);
    
    for (int i=1; i<=a; i++) {
        if((n%i) == 0) {
            answer += i;
            if (i != n/i) {
                answer += (n/i);
            }
        }
    }
        
        return answer;
    }
}