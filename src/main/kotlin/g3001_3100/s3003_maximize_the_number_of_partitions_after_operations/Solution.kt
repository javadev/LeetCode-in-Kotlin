package g3001_3100.s3003_maximize_the_number_of_partitions_after_operations

// #Hard #String #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2024_02_28_Time_147_ms_(100.00%)_Space_35.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxPartitionsAfterOperations(s: String, k: Int): Int {
        if (k == ALPHABET_SIZE) {
            return 1
        }
        val n = s.length
        val ansr = IntArray(n)
        val usedr = IntArray(n)
        var used = 0
        var cntUsed = 0
        var ans = 1
        for (i in n - 1 downTo 0) {
            val ch = s[i].code - 'a'.code
            if ((used and (1 shl ch)) == 0) {
                if (cntUsed == k) {
                    cntUsed = 0
                    used = 0
                    ans++
                }
                used = used or (1 shl ch)
                cntUsed++
            }
            ansr[i] = ans
            usedr[i] = used
        }
        var ansl = 0
        ans = ansr[0]
        var l = 0
        while (l < n) {
            used = 0
            cntUsed = 0
            var usedBeforeLast = 0
            var usedTwiceBeforeLast = 0
            var last = -1
            var r = l
            while (r < n) {
                val ch = s[r].code - 'a'.code
                if ((used and (1 shl ch)) == 0) {
                    if (cntUsed == k) {
                        break
                    }
                    usedBeforeLast = used
                    last = r
                    used = used or (1 shl ch)
                    cntUsed++
                } else if (cntUsed < k) {
                    usedTwiceBeforeLast = usedTwiceBeforeLast or (1 shl ch)
                }
                r++
            }
            if (cntUsed == k) {
                if (last - l > Integer.bitCount(usedBeforeLast)) {
                    ans = max(ans, (ansl + 1 + ansr[last]))
                }
                if (last + 1 < r) {
                    if (last + 2 >= n) {
                        ans = max(ans, (ansl + 1 + 1))
                    } else {
                        if (Integer.bitCount(usedr[last + 2]) == k) {
                            val canUse = ((1 shl ALPHABET_SIZE) - 1) and used.inv() and usedr[last + 2].inv()
                            ans = if (canUse > 0) {
                                max(ans, (ansl + 1 + 1 + ansr[last + 2]))
                            } else {
                                max(ans, (ansl + 1 + ansr[last + 2]))
                            }
                            val l1 = s[last + 1].code - 'a'.code
                            if ((usedTwiceBeforeLast and (1 shl l1)) == 0) {
                                ans = max(ans, (ansl + 1 + ansr[last + 1]))
                            }
                        } else {
                            ans = max(ans, (ansl + 1 + ansr[last + 2]))
                        }
                    }
                }
            }
            l = r
            ansl++
        }
        return ans
    }

    companion object {
        private const val ALPHABET_SIZE = 'z'.code - 'a'.code + 1
    }
}
