package g3301_3400.s3348_smallest_divisible_digit_product_ii

// #Hard #String #Math #Greedy #Backtracking #Number_Theory
// #2024_11_14_Time_46_ms_(100.00%)_Space_48.2_MB_(100.00%)

class Solution {
    fun smallestNumber(num: String, t: Long): String {
        var t = t
        var tmp = t
        for (i in 9 downTo 2) {
            while (tmp % i == 0L) {
                tmp /= i.toLong()
            }
        }
        if (tmp > 1) {
            return "-1"
        }
        val s = num.toCharArray()
        val n = s.size
        val leftT = LongArray(n + 1)
        leftT[0] = t
        var i0 = n - 1
        for (i in 0 until n) {
            if (s[i] == '0') {
                i0 = i
                break
            }
            leftT[i + 1] = leftT[i] / gcd(leftT[i], s[i].code.toLong() - '0'.code.toLong())
        }
        if (leftT[n] == 1L) {
            return num
        }
        for (i in i0 downTo 0) {
            while (++s[i] <= '9') {
                var tt = leftT[i] / gcd(leftT[i], s[i].code.toLong() - '0'.code.toLong())
                for (j in n - 1 downTo i + 1) {
                    if (tt == 1L) {
                        s[j] = '1'
                        continue
                    }
                    for (k in 9 downTo 2) {
                        if (tt % k == 0L) {
                            s[j] = ('0'.code + k).toChar()
                            tt /= k.toLong()
                            break
                        }
                    }
                }
                if (tt == 1L) {
                    return String(s)
                }
            }
        }
        val ans = StringBuilder()
        for (i in 9 downTo 2) {
            while (t % i == 0L) {
                ans.append(('0'.code + i).toChar())
                t /= i.toLong()
            }
        }
        while (ans.length <= n) {
            ans.append('1')
        }
        return ans.reverse().toString()
    }

    private fun gcd(a: Long, b: Long): Long {
        var a = a
        var b = b
        while (a != 0L) {
            val tmp = a
            a = b % a
            b = tmp
        }
        return b
    }
}
