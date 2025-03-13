package g3401_3500.s3441_minimum_cost_good_caption

// #Hard #String #Dynamic_Programming #2025_03_13_Time_48_ms_(83.33%)_Space_48.60_MB_(83.33%)

import kotlin.math.max

class Solution {
    fun minCostGoodCaption(caption: String): String {
        val n = caption.length
        if (n < 3) {
            return ""
        }
        val s = caption.toByteArray()
        val f = IntArray(n + 1)
        f[n - 2] = Int.Companion.MAX_VALUE / 2
        f[n - 1] = f[n - 2]
        val t = ByteArray(n + 1)
        val size = ByteArray(n)
        for (i in n - 3 downTo 0) {
            val sub = s.copyOfRange(i, i + 3)
            sub.sort()
            val a = sub[0]
            val b = sub[1]
            val c = sub[2]
            val s3 = t[i + 3]
            var res = f[i + 3] + (c - a)
            var mask = b.toInt() shl 24 or (s3.toInt() shl 16) or (s3.toInt() shl 8) or s3.toInt()
            size[i] = 3
            if (i + 4 <= n) {
                val sub4 = s.copyOfRange(i, i + 4)
                sub4.sort()
                val a4 = sub4[0]
                val b4 = sub4[1]
                val c4 = sub4[2]
                val d4 = sub4[3]
                val s4 = t[i + 4]
                val res4 = f[i + 4] + (c4 - a4 + d4 - b4)
                val mask4 = b4.toInt() shl 24 or (b4.toInt() shl 16) or (s4.toInt() shl 8) or s4.toInt()
                if (res4 < res || res4 == res && mask4 < mask) {
                    res = res4
                    mask = mask4
                    size[i] = 4
                }
            }
            if (i + 5 <= n) {
                val sub5 = s.copyOfRange(i, i + 5)
                sub5.sort()
                val a5 = sub5[0]
                val b5 = sub5[1]
                val c5 = sub5[2]
                val d5 = sub5[3]
                val e5 = sub5[4]
                val res5 = f[i + 5] + (d5 - a5 + e5 - b5)
                val mask5 = c5.toInt() shl 24 or (c5.toInt() shl 16) or (c5.toInt() shl 8) or t[i + 5].toInt()
                if (res5 < res || res5 == res && mask5 < mask) {
                    res = res5
                    mask = mask5
                    size[i] = 5
                }
            }
            f[i] = res
            t[i] = (mask shr 24).toByte()
        }
        val ans = StringBuilder(n)
        var i = 0
        while (i < n) {
            ans.append(Char(t[i].toUShort()).toString().repeat(max(0.0, size[i].toDouble()).toInt()))
            i += size[i].toInt()
        }
        return ans.toString()
    }
}
