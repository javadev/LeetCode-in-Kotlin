package g0201_0300.s0264_ugly_number_ii

// #Medium #Hash_Table #Dynamic_Programming #Math #Heap_Priority_Queue #Dynamic_Programming_I_Day_11
// #2022_11_03_Time_182_ms_(95.45%)_Space_34.7_MB_(90.91%)

class Solution {
    fun nthUglyNumber(n: Int): Int {
        val ugly = IntArray(n)
        var i2 = 0
        var i3 = 0
        var i5 = 0
        var ugly2 = 2
        var ugly3 = 3
        var ugly5 = 5
        var nextugly: Int
        ugly[0] = 1
        for (i in 1 until n) {
            nextugly = Math.min(Math.min(ugly2, ugly3), ugly5)
            ugly[i] = nextugly
            if (nextugly == ugly2) {
                i2++
                ugly2 = ugly[i2] * 2
            }
            if (nextugly == ugly3) {
                i3++
                ugly3 = ugly[i3] * 3
            }
            if (nextugly == ugly5) {
                i5++
                ugly5 = ugly[i5] * 5
            }
        }
        return ugly[n - 1]
    }
}
