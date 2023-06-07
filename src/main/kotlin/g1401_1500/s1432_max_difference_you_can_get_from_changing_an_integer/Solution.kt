package g1401_1500.s1432_max_difference_you_can_get_from_changing_an_integer

// #Medium #Math #Greedy #2023_06_07_Time_147_ms_(100.00%)_Space_33_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxDiff(num: Int): Int {
        var num = num
        val stack: Deque<Int> = ArrayDeque()
        var xMax = 9
        val yMax = 9
        var xMin = 0
        var yMin = 0
        var min = 0
        var max = 0
        var areDigitsUnique = true
        while (num != 0) {
            if (stack.isNotEmpty() && num % 10 != stack.peek()) {
                areDigitsUnique = false
            }
            stack.push(num % 10)
            num /= 10
            if (stack.peek() != 9) {
                xMax = stack.peek()
            }
            if (stack.peek() > 1) {
                xMin = stack.peek()
            }
        }
        if (areDigitsUnique || stack.peek() == xMin) {
            // Handles no leading zeros/non zero constraints.
            yMin = 1
        }
        while (stack.isNotEmpty()) {
            min = min * 10 + if (stack.peek() == xMin) yMin else stack.peek()
            max = max * 10 + if (stack.peek() == xMax) yMax else stack.peek()
            stack.pop()
        }
        return max - min
    }
}
