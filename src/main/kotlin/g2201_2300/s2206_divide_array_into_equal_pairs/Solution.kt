package g2201_2300.s2206_divide_array_into_equal_pairs

// #Easy #Array #Hash_Table #Bit_Manipulation #Counting
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
