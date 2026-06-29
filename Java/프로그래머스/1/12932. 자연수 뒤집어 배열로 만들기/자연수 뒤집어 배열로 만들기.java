class Solution {
    public int[] solution(long n) {

        String[] array = String.valueOf(n).split("");
        int[] answer = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            answer[i] = Integer.parseInt(array[array.length - 1 - i]);
        }

        return answer;
    }
}