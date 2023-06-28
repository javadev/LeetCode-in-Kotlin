package g2201_2300.s2261_k_divisible_elements_subarrays

// #Medium #Array #Hash_Table #Trie #Enumeration #Hash_Function #Rolling_Hash
class Solution {
    fun countDistinct(nums: IntArray, k: Int, p: Int): Int {
        val numSubarray = HashSet<Long>()
        for (i in nums.indices) {
            var countDiv = 0
            var hashCode: Long = 1
            for (j in i until nums.size) {
                hashCode = 199L * hashCode + nums[j]
                if (nums[j] % p == 0) {
                    countDiv++
                }
                if (countDiv <= k) {
                    numSubarray.add(hashCode)
                } else {
                    break
                }
            }
        }
        return numSubarray.size
    }
}
