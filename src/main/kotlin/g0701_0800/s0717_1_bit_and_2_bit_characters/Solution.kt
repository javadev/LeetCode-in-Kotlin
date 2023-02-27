package g0701_0800.s0717_1_bit_and_2_bit_characters

// #Easy #Array #2023_02_27_Time_165_ms_(100.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun isOneBitCharacter(arr: IntArray): Boolean {
        var i = 0
        while (i < arr.size - 1) {
            i = if (arr[i] == 1) i + 2 else i + 1
        }
        return i == arr.size - 1
    }
}
