package g2201_2300.s2215_find_the_difference_of_two_arrays

// #Easy #Array #Hash_Table #LeetCode_75_Hash_Map/Set
// #2023_06_27_Time_352_ms_(98.63%)_Space_41.4_MB_(98.63%)

class Solution {
    fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
        val set1 = createSet(nums1)
        val set2 = createSet(nums2)
        return listOf(getMissing(set1, set2), getMissing(set2, set1))
    }

    private fun createSet(array: IntArray): Set<Int> {
        val set: MutableSet<Int> = HashSet()
        for (x in array) {
            set.add(x)
        }
        return set
    }

    private fun getMissing(first: Set<Int>, second: Set<Int>): List<Int> {
        val list: MutableList<Int> = ArrayList()
        for (x in first) {
            if (!second.contains(x)) {
                list.add(x)
            }
        }
        return list
    }
}
