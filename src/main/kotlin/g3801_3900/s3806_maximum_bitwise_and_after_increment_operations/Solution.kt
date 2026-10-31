package g3801_3900.s3806_maximum_bitwise_and_after_increment_operations

// #Hard #Array #Sorting #Greedy #Bit_Manipulation #Senior_Staff #Weekly_Contest_484
// #2026_06_09_Time_107_ms_(78.72%)_Space_51.33_MB_(44.68%)

class Solution {
    fun maximumAND(a: IntArray, b: Int, c: Int): Int {
        var e: Long = 0L
        val f = a.size
        val g = LongArray(f)
        for (h in 30 downTo 0) {
            val i = e or (1L shl h)
            for (j in 0..<f) {
                val k = a[j].toLong()
                val l = i and k.inv()
                if (l == 0L) {
                    g[j] = 0
                } else {
                    var n = 63 - java.lang.Long.numberOfLeadingZeros(l)
                    while (((k shr n) and 1L) == 1L) {
                        n++
                    }
                    val o = (1L shl n) - 1
                    g[j] = ((k and o.inv()) or (1L shl n) or (i and o)) - k
                }
            }
            g.sort()
            var p: Long = 0
            for (q in 0..<c) {
                p += g[q]
            }
            if (p <= b) {
                e = i
            }
        }
        return e.toInt()
    }
}
