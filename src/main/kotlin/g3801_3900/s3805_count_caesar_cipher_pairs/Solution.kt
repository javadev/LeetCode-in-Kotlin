package g3801_3900.s3805_count_caesar_cipher_pairs

// #Medium #Array #String #Hash_Table #Math #Counting #Senior #Weekly_Contest_484
// #2026_05_22_Time_34_ms_(98.75%)_Space_67.70_MB_(82.50%)

class Solution {
    fun countPairs(words: Array<String>): Long {
        val a = words
        val b: MutableMap<String?, Int?> = HashMap<String?, Int?>()
        var c: Long = 0
        for (d in a) {
            val e = d.toCharArray()
            val f = e[0].code
            for (g in e.indices) {
                e[g] = ((e[g].code - f + 26) % 26).toChar()
            }
            val h = String(e)
            val i: Int = b.getOrDefault(h, 0)!!
            c += i.toLong()
            b.put(h, i + 1)
        }
        return c
    }
}
