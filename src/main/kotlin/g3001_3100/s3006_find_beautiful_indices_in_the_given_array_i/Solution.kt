package g3001_3100.s3006_find_beautiful_indices_in_the_given_array_i

// #Medium #String #Binary_Search #Two_Pointers #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_28_Time_287_ms_(94.92%)_Space_38.7_MB_(100.00%)

class Solution {
    fun beautifulIndices(s: String, a: String, b: String, q: Int): List<Int> {
        val sc = s.toCharArray()
        val ac = a.toCharArray()
        val bc = b.toCharArray()
        val lpsa = getLps(ac)
        val lpsb = getLps(bc)
        val comp = IntArray(sc.size)
        val st = IntArray(sc.size)
        var si = 0
        var k: Int
        var mo = -bc.size + 1
        if (bc[0] == sc[0]) {
            comp[0] = 1
            if (bc.size == 1) {
                st[si++] = mo
            }
        }
        for (i in 1 until comp.size) {
            mo++
            if (sc[i] == bc[0]) {
                comp[i] = 1
            }
            k = comp[i - 1]
            if (k == bc.size) {
                k = lpsb[k - 1]
            }
            while (k > 0) {
                if (bc[k] == sc[i]) {
                    comp[i] = k + 1
                    break
                }
                k = lpsb[k - 1]
            }
            if (comp[i] == bc.size) {
                st[si++] = mo
            }
        }
        var sia = 0
        mo = -ac.size + 1
        val ret: MutableList<Int> = ArrayList()
        if (si == 0) {
            return ret
        }
        if (sc[0] == ac[0]) {
            comp[0] = 1
            if (ac.size == 1 && st[0] <= q) {
                ret.add(0)
            }
        } else {
            comp[0] = 0
        }
        for (i in 1 until comp.size) {
            mo++
            if (sc[i] == ac[0]) {
                comp[i] = 1
            } else {
                comp[i] = 0
            }
            k = comp[i - 1]
            if (k == ac.size) {
                k = lpsa[k - 1]
            }
            while (k > 0) {
                if (ac[k] == sc[i]) {
                    comp[i] = k + 1
                    break
                }
                k = lpsa[k - 1]
            }
            if (comp[i] == ac.size) {
                while (sia < si && st[sia] + q < mo) {
                    sia++
                }
                if (sia == si) {
                    break
                }
                if (mo >= st[sia] - q && mo <= st[sia] + q) {
                    ret.add(mo)
                }
            }
        }
        return ret
    }

    private fun getLps(xc: CharArray): IntArray {
        val r = IntArray(xc.size)
        var k: Int
        for (i in 1 until xc.size) {
            if (xc[i] == xc[0]) {
                r[i] = 1
            }
            k = r[i - 1]
            while (k > 0) {
                if (xc[k] == xc[i]) {
                    r[i] = k + 1
                    break
                }
                k = r[k - 1]
            }
        }
        return r
    }
}
