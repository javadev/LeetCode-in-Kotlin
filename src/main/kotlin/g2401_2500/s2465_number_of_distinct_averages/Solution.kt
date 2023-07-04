package g2401_2500.s2465_number_of_distinct_averages

// #Easy #Array #Hash_Table #Sorting #Two_Pointers
class Solution {
    fun distinctAverages(nums: IntArray): Int {
        nums.sort()
        val set: MutableSet<Int> = HashSet()
        var l = 0
        var r = nums.size - 1
        while (l < r) {
            set.add(nums[l++] + nums[r--])
        }
        return set.size
    }
}
