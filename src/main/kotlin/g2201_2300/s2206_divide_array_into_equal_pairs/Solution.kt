package g2201_2300.s2206_divide_array_into_equal_pairs

// #Easy #Array #Hash_Table #Bit_Manipulation #Counting
// #2023_06_27_Time_221_ms_(71.43%)_Space_37.6_MB_(85.71%)

class Solution {
    fun divideArray(nums: IntArray): Boolean {
        val freq = IntArray(501)
        for (num in nums) {
            ++freq[num]
        }
        for (f in freq) {
            if (f % 2 != 0) {
                return false
            }
        }
        return true
    }
}
