package g1901_2000.s1982_find_array_given_subset_sums

// #Hard #Array #Divide_and_Conquer #2023_06_21_Time_640_ms_(100.00%)_Space_51_MB_(100.00%)

class Solution {
    fun recoverArray(n: Int, sums: IntArray): IntArray {
        sums.sort()
        var m = sums.size
        var zeroShift = 0
        val res = IntArray(n)
        for (i in 0 until n) {
            val diff = sums[1] - sums[0]
            var p = 0
            var k = 0
            var zpos = m
            for (j in 0 until m) {
                if (k < p && sums[k] == sums[j]) {
                    k++
                } else {
                    if (zeroShift == sums[j]) {
                        zpos = p
                    }
                    sums[p++] = sums[j] + diff
                }
            }
            if (zpos >= m / 2) {
                res[i] = -diff
            } else {
                res[i] = diff
                zeroShift += diff
            }
            m /= 2
        }
        return res
    }
}
