package g0401_0500.s0448_find_all_numbers_disappeared_in_an_array

// #Easy #Array #Hash_Table #Udemy_Arrays #2022_12_24_Time_394_ms_(100.00%)_Space_46_MB_(94.74%)

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val arr = IntArray(nums.size)
        var counter = 0
        for (i in nums.indices) {
            arr[nums[counter] - 1] = 1
            counter++
        }
        val res: MutableList<Int> = ArrayList()
        for (i in arr.indices) {
            if (arr[i] == 0) {
                res.add(i + 1)
            }
        }
        return res
    }
}
