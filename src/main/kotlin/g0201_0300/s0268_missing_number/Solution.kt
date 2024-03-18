package g0201_0300.s0268_missing_number

// #Easy #Array #Hash_Table #Math #Sorting #Binary_Search #Bit_Manipulation
// #2022_11_03_Time_380_ms_(83.49%)_Space_48.6_MB_(76.76%)

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var a = nums.size
        for (i in nums.indices) {
            a = a xor i
            a = a xor nums[i]
        }
        return a
    }
}
