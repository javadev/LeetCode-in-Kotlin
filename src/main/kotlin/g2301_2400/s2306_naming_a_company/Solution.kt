package g2301_2400.s2306_naming_a_company

// #Hard #Array #String #Hash_Table #Bit_Manipulation #Enumeration
// #2023_06_29_Time_590_ms_(100.00%)_Space_51.1_MB_(100.00%)

class Solution {
    fun distinctNames(a: Array<String>): Long {
        val m = Array<MutableSet<String>>(26) { mutableSetOf() }
        for (s in a) {
            val i = s[0].code - 97
            m[i].add(s.substring(1))
        }

        var res = 0L
        for (i in m.indices) {
            val b1 = m[i]
            if (b1.isEmpty()) {
                continue
            }
            for (y in i + 1 until m.size) {
                val b2 = m[y]
                if (b2.isEmpty()) {
                    continue
                }
                res += compare(b1, b2)
            }
        }
        return res
    }

    fun compare(b1: Set<String>, b2: Set<String>): Long {
        val set1 = if (b1.size > b2.size) b1 else b2
        val set2 = if (b1.size > b2.size) b2 else b1
        var n1 = set1.size
        var n2 = set2.size
        for (s in set1) {
            if (set2.contains(s)) {
                n1--
                n2--
            }
        }
        return (n1 * n2) * 2L
    }
}
