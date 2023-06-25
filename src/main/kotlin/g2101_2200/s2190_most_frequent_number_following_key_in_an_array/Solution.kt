package g2101_2200.s2190_most_frequent_number_following_key_in_an_array

// #Easy #Array #Hash_Table #Counting
class Solution {
    fun mostFrequent(nums: IntArray, key: Int): Int {
        val store = IntArray(1001)
        for (i in 0 until nums.size - 1) {
            if (nums[i] == key) {
                store[nums[i + 1]]++
            }
        }
        var res = 0
        var count = store[0]
        for (i in 1..1000) {
            if (count < store[i]) {
                count = store[i]
                res = i
            }
        }
        return res
    }
}
