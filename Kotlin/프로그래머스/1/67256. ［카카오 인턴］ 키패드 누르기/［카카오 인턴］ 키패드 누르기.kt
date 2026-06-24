import kotlin.math.abs
class Solution {
    fun solution(numbers: IntArray, hand: String): String {
		var answer = ""

		val phone = hashMapOf(
			1 to Pair(0,0), 2 to Pair(0,1), 3 to Pair(0,2),
			4 to Pair(1,0), 5 to Pair(1,1), 6 to Pair(1,2),
			7 to Pair(2,0), 8 to Pair(2,1), 9 to Pair(2,2),
			10 to Pair(3,0), 0 to Pair(3,1), 11 to Pair(3,2),
		)

		var left = phone[10]
		var right = phone[11]

		numbers.forEach { number ->
			when (number) {
				1 -> {
					left = phone[1]
					answer += "L"
				}
				2,5,8,0 -> {
					val hand = getHand(phone[number], left, right, hand)
					if (hand == "L") {
						left = phone[number]
					} else {
						right = phone[number]
					}
					answer += hand
				}
				3 -> {
					right = phone[3]
					answer += "R"
				}
				4 -> {
					left = phone[4]
					answer += "L"
				}
				6 -> {
					right = phone[6]
					answer += "R"
				}
				7 -> {
					left = phone[7]
					answer += "L"
				}
				9 -> {
					right = phone[9]
					answer += "R"
				}
			}
		}

		return answer
	}
	
	private fun getHand(
		target: Pair<Int, Int>?,
		left: Pair<Int, Int>?, 
		right: Pair<Int, Int>?,
		hand: String
	): String {
		val lDistance = abs(target!!.first - left!!.first) + abs(target.second - left.second)
		val rDistance = abs(target!!.first - right!!.first) + abs(target.second - right.second)
		
		return if (lDistance < rDistance) {
			"L"
		} else if (lDistance > rDistance) {
			"R"
		} else {
			if (hand == "right") "R" else "L"
		}
	}
}