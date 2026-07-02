class Solution {
    public long solution(long n) {
		long answer = 0;

		String[] numbers = String.valueOf(n).split("");

		String[] newNumbers = new String[numbers.length];

		for (int i=0; i<numbers.length; i++) {
			newNumbers[i] = numbers[(numbers.length-1)-i];
		}

		String result = String.join("", newNumbers);

		return Long.parseLong(result);
	}
}