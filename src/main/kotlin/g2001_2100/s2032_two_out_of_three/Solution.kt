package g2001_2100.s2032_two_out_of_three

// #Easy #Array #Hash_Table #2023_06_23_Time_251_ms_(83.33%)_Space_38_MB_(100.00%)

class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        val ans: MutableSet<Int> = HashSet()
        val set1: MutableSet<Int> = HashSet()
        for (i in nums1) {
            set1.add(i)
        }
        val set2: MutableSet<Int> = HashSet()
        for (i in nums2) {
            set2.add(i)
        }
        val set3: MutableSet<Int> = HashSet()
        for (i in nums3) {
            set3.add(i)
        }
        for (j in nums1) {
            if (set2.contains(j) || set3.contains(j)) {
                ans.add(j)
            }
        }
        for (j in nums2) {
            if (set1.contains(j) || set3.contains(j)) {
                ans.add(j)
            }
        }
        for (j in nums3) {
            if (set1.contains(j) || set2.contains(j)) {
                ans.add(j)
            }
        }
        val result: MutableList<Int> = ArrayList()
        result.addAll(ans)
        return result
    }
}
