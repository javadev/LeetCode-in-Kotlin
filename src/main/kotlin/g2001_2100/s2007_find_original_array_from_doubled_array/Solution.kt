package g2001_2100.s2007_find_original_array_from_doubled_array

// #Medium #Array #Hash_Table #Sorting #Greedy
class Solution {
    fun findOriginalArray(changed: IntArray): IntArray {
        if (changed.size % 2 == 1) {
            return IntArray(0)
        }
        val a = IntArray(100001)
        for (j in changed) {
            a[j]++
        }
        if (a[0] % 2 == 1) {
            return IntArray(0)
        }
        val ans = IntArray(changed.size / 2)
        var p = 0
        if (a[0] > 0) {
            a[0] /= 2
            while (a[0] > 0) {
                ans[p++] = 0
                a[0]--
            }
        }
        for (i in 1..100001 / 2) {
            if (a[i] == 0) {
                continue
            }
            val tmp = i * 2
            if (a[tmp] >= a[i]) {
                a[tmp] = a[tmp] - a[i]
                while (a[i] > 0) {
                    ans[p++] = i
                    a[i]--
                }
            } else {
                return IntArray(0)
            }
        }
        for (i in 1 until a.size) {
            if (a[i] != 0) {
                return IntArray(0)
            }
        }
        return ans
    }
}
