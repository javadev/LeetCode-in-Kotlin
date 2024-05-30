package g3101_3200.s3158_find_the_xor_of_numbers_which_appear_twice

// #Easy #Array #Hash_Table #Bit_Manipulation
// #2024_05_30_Time_166_ms_(92.21%)_Space_36.5_MB_(76.62%)

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
