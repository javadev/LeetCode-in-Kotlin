package g2001_2100.s2001_number_of_pairs_of_interchangeable_rectangles

// #Medium #Array #Hash_Table #Math #Counting #Number_Theory
@Suppress("NAME_SHADOWING")
class Solution {
    private fun factorial(n: Long): Long {
        var n = n
        var m: Long = 0
        while (n > 0) {
            m += n
            n = n - 1
        }
        return m
    }

    fun interchangeableRectangles(rec: Array<IntArray>): Long {
        val ratio = DoubleArray(rec.size)
        for (i in rec.indices) {
            ratio[i] = rec[i][0].toDouble() / rec[i][1]
        }
        ratio.sort()
        var res: Long = 0
        var k = 0
        for (j in 0 until ratio.size - 1) {
            if (ratio[j] == ratio[j + 1]) {
                k++
            }
            if (ratio[j] != ratio[j + 1] || j + 2 == ratio.size) {
                res += factorial(k.toLong())
                k = 0
            }
        }
        return res
    }
}
