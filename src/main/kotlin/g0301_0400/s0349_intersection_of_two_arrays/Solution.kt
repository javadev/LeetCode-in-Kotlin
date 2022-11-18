package g0301_0400.s0349_intersection_of_two_arrays

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers
// #2022_11_18_Time_346_ms_(66.99%)_Space_38.3_MB_(72.82%)

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val occ = BooleanArray(1001)
        for (k in nums1) {
            occ[k] = true
        }
        val res: MutableList<Int> = ArrayList()
        for (j in nums2) {
            if (occ[j]) {
                occ[j] = false
                res.add(j)
            }
        }
        val result = IntArray(res.size)
        for (i in res.indices) {
            result[i] = res[i]
        }
        return result
    }
}
