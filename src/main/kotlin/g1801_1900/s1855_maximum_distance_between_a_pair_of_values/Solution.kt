package g1801_1900.s1855_maximum_distance_between_a_pair_of_values

// #Medium #Array #Greedy #Binary_Search #Two_Pointers #Binary_Search_I_Day_11
class Solution {
    fun maxDistance(n1: IntArray, n2: IntArray): Int {
        val n = n1.size
        val m = n2.size
        var po1 = 0
        var po2 = 0
        var res = 0
        while (po1 < n && po2 < m) {
            if (n1[po1] > n2[po2]) {
                po1++
            } else {
                if (po2 != po1) {
                    res = Math.max(res, po2 - po1)
                }
                po2++
            }
        }
        return res
    }
}
