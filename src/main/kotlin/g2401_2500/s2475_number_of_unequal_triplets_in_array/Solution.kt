package g2401_2500.s2475_number_of_unequal_triplets_in_array

// #Easy #Array #Hash_Table
class Solution {
    fun unequalTriplets(nums: IntArray): Int {
        var trips = 0
        var pairs = 0
        val count = IntArray(1001)
        for (i in nums.indices) {
            trips += pairs - count[nums[i]] * (i - count[nums[i]])
            pairs += i - count[nums[i]]
            count[nums[i]] += 1
        }
        return trips
    }
}
