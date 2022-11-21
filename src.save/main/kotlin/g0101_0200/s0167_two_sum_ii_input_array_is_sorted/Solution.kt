package g0101_0200.s0167_two_sum_ii_input_array_is_sorted

// #Medium #Array #Binary_Search #Two_Pointers #Algorithm_I_Day_3_Two_Pointers
// #Binary_Search_I_Day_7 #2022_10_11_Time_403_ms_(68.74%)_Space_47.2_MB_(58.24%)

class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        var i = 0
        var j = numbers.size - 1
        while (i < j) {
            val sum = numbers[i] + numbers[j]
            if (sum == target) {
                res[0] = i + 1
                res[1] = j + 1
                return res
            } else if (sum < target) {
                i++
            } else {
                j--
            }
        }
        return res
    }
}
