package g3101_3200.s3158_find_the_xor_of_numbers_which_appear_twice

// #Easy #Array #Hash_Table #Bit_Manipulation #2024_05_30_Time_1_ms_(99.87%)_Space_42.3_MB_(99.40%)

class Solution {
    fun duplicateNumbersXOR(nums: IntArray): Int {
        val appeared = BooleanArray(51)
        var res = 0
        for (num in nums) {
            if (appeared[num]) {
                res = res xor num
            }
            appeared[num] = true
        }
        return res
    }
}
