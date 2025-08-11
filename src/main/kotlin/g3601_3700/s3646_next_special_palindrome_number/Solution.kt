package g3601_3700.s3646_next_special_palindrome_number

// #Hard #Weekly_Contest_462 #2025_08_11_Time_1758_ms_(100.00%)_Space_70.14_MB_(100.00%)

import java.util.Collections

class Solution {
    private val specials: MutableList<Long> = ArrayList<Long>()

    fun specialPalindrome(n: Long): Long {
        if (specials.isEmpty()) {
            init(specials)
        }
        var pos = specials.binarySearch<Long>(n + 1)
        if (pos < 0) {
            pos = -pos - 1
        }
        return specials[pos]
    }

    private fun init(v: MutableList<Long>) {
        val half: MutableList<Char> = ArrayList<Char>()
        var mid: String?
        for (mask in 1..<(1 shl 9)) {
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
                        mid = ('0'.code + d).toChar().toString()
                    }
                    val h = d / 2
                    for (i in 0..<h) {
                        half.add(('0'.code + d).toChar())
                    }
                }
            }
            Collections.sort<Char>(half)
            permute(half, 0, v, mid!!)
        }
        v.sort<Long>()
        val set: MutableSet<Long> = LinkedHashSet<Long>(v)
        v.clear()
        v.addAll(set)
    }

    private fun permute(half: MutableList<Char>, start: Int, v: MutableList<Long>, mid: String) {
        if (start == half.size) {
            val left = StringBuilder()
            for (c in half) {
                left.append(c)
            }
            val right = StringBuilder(left).reverse().toString()
            val s = left.toString() + mid + right
            if (s.isNotEmpty()) {
                val x = s.toLong()
                v.add(x)
            }
            return
        }
        val swapped: MutableSet<Char?> = HashSet<Char?>()
        for (i in start..<half.size) {
            if (swapped.contains(half[i])) {
                continue
            }
            swapped.add(half[i])
            Collections.swap(half, start, i)
            permute(half, start + 1, v, mid)
            Collections.swap(half, start, i)
        }
    }
}
