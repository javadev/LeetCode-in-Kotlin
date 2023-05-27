package g1001_1100.s1044_longest_duplicate_substring

// #Hard #String #Binary_Search #Sliding_Window #Hash_Function #Rolling_Hash #Suffix_Array
// #2023_05_27_Time_592_ms_(100.00%)_Space_106.4_MB_(100.00%)

class Solution {
    private lateinit var hsh: LongArray
    private lateinit var pw: LongArray
    private val cnt: Array<MutableList<Int>?> = arrayOfNulls(26)
    fun longestDupSubstring(s: String): String {
        val n = s.length
        val base = 131
        for (i in 0..25) {
            cnt[i] = ArrayList()
        }
        hsh = LongArray(n + 1)
        pw = LongArray(n + 1)
        pw[0] = 1
        for (j in 1..n) {
            hsh[j] = (hsh[j - 1] * base + s[j - 1].code.toLong()) % MOD
            pw[j] = pw[j - 1] * base % MOD
            cnt[s[j - 1].code - 'a'.code]!!.add(j - 1)
        }
        var ans = ""
        for (i in 0..25) {
            if (cnt[i]!!.isEmpty()) {
                continue
            }
            val idx: MutableList<Int>? = cnt[i]
            var set: MutableSet<Long?>
            var lo = 1
            var hi = n - idx!![0]
            while (lo <= hi) {
                val len = (lo + hi) / 2
                set = HashSet()
                var found = false
                for (nxt in idx) {
                    if (nxt + len <= n) {
                        val substrHash = getSubstrHash(nxt, nxt + len)
                        if (set.contains(substrHash)) {
                            found = true
                            if (len + 1 > ans.length) {
                                ans = s.substring(nxt, nxt + len)
                            }
                            break
                        }
                        set.add(substrHash)
                    }
                }
                if (found) {
                    lo = len + 1
                } else {
                    hi = len - 1
                }
            }
        }
        return ans
    }

    private fun getSubstrHash(l: Int, r: Int): Long {
        return (hsh[r] - hsh[l] * pw[r - l] % MOD + MOD) % MOD
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
