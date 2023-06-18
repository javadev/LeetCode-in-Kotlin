package g1701_1800.s1769_minimum_number_of_operations_to_move_all_balls_to_each_box

// #Medium #Array #String #2023_06_18_Time_217_ms_(75.00%)_Space_37.8_MB_(50.00%)

class Solution {
    fun minOperations(boxes: String): IntArray {
        var countFromLeft = 0
        var countFromRight = 0
        var moves = 0
        val result = IntArray(boxes.length)
        for (c in boxes.toCharArray()) {
            moves += countFromLeft
            if (c == '1') {
                countFromLeft++
            }
        }
        for (i in boxes.length - 1 downTo 0) {
            val c = boxes[i]
            result[i] = moves
            if (c == '1') {
                countFromLeft--
                countFromRight++
            }
            moves -= countFromLeft
            moves += countFromRight
        }
        return result
    }
}
