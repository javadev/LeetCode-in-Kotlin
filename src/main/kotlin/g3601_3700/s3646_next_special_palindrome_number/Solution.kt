package g3601_3700.s3646_next_special_palindrome_number

// #Hard #Weekly_Contest_462 #2025_08_12_Time_34_ms_(100.00%)_Space_53.80_MB_(66.67%)

import java.util.Collections

class Solution {
    companion object {
        private val SPECIALS = mutableListOf<Long>()
    }

    fun specialPalindrome(n: Long): Long {
        if (SPECIALS.isEmpty()) {
            init(SPECIALS)
        }
        var pos = SPECIALS.binarySearch(n + 1)
        if (pos < 0) {
            pos = -pos - 1
        }
        return SPECIALS[pos]
    }

    private fun init(v: MutableList<Long>) {
        val half = mutableListOf<Char>()
        var mid: String
        for (mask in 1 until (1 shl 9)) {
            var sum = 0
            var oddCnt = 0
            for (d in 1..9) {
                if ((mask and (1 shl (d - 1))) != 0) {
                    sum += d
                    if (d % 2 == 1) {
                        oddCnt++
                    }
                }
            }
            if (sum > 18 || oddCnt > 1) {
                continue
            }
            half.clear()
            mid = ""
            for (d in 1..9) {
                if ((mask and (1 shl (d - 1))) != 0) {
                    if (d % 2 == 1) {
                        mid = ('0' + d).toString()
                    }
                    val h = d / 2
                    repeat(h) {
                        half.add('0' + d)
                    }
                }
            }
            half.sort()
            permute(half, 0, v, mid)
        }
        v.sort()
        val set = LinkedHashSet(v)
        v.clear()
        v.addAll(set)
    }

    private fun permute(half: MutableList<Char>, start: Int, v: MutableList<Long>, mid: String) {
        if (start == half.size) {
            val left = StringBuilder()
            for (c in half) {
                left.append(c)
            }
            val right = left.reversed().toString()
            val s = left.toString() + mid + right
            if (s.isNotEmpty()) {
                val x = s.toLong()
                v.add(x)
            }
            return
        }
        val swapped = mutableSetOf<Char>()
        for (i in start until half.size) {
            if (half[i] in swapped) {
                continue
            }
            swapped.add(half[i])
            Collections.swap(half, start, i)
            permute(half, start + 1, v, mid)
            Collections.swap(half, start, i)
        }
    }
}
