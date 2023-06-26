package g2201_2300.s2248_intersection_of_multiple_arrays

// #Easy #Array #Hash_Table #Counting
class Solution {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        val count = IntArray(1001)
        for (arr in nums) {
            for (i in arr) {
                ++count[i]
            }
        }
        for (i in count.indices) {
            if (count[i] == nums.size) {
                ans.add(i)
            }
        }
        return ans
    }
}
