package g3401_3500.s3463_check_if_digits_are_equal_in_string_after_operations_ii

// #Hard #String #Math #Number_Theory #Combinatorics
// #2025_02_25_Time_38_ms_(100.00%)_Space_45.90_MB_(11.11%)

class Solution {
    private fun powMod10(a: Int, n: Int): Int {
        var a = a
        var n = n
        var x = 1
        while (n >= 1) {
            if (n % 2 == 1) {
                x = (x * a) % 10
            }
            a = (a * a) % 10
            n /= 2
        }
        return x
    }

    private fun f(n: Int): IntArray {
        val ns = IntArray(n + 1)
        val n2 = IntArray(n + 1)
        val n5 = IntArray(n + 1)
        ns[0] = 1
        for (i in 1..n) {
            var m = i
            n2[i] = n2[i - 1]
            n5[i] = n5[i - 1]
            while (m % 2 == 0) {
                m /= 2
                n2[i]++
            }
            while (m % 5 == 0) {
                m /= 5
                n5[i]++
            }
            ns[i] = (ns[i - 1] * m) % 10
        }
        val inv = IntArray(10)
        for (i in 1..9) {
            for (j in 0..9) {
                if (i * j % 10 == 1) {
                    inv[i] = j
                }
            }
        }
        val xs = IntArray(n + 1)
        for (k in 0..n) {
            var a = 0
            val s2 = n2[n] - n2[n - k] - n2[k]
            val s5 = n5[n] - n5[n - k] - n5[k]
            if (s2 == 0 || s5 == 0) {
                a = (ns[n] * inv[ns[n - k]] * inv[ns[k]] * powMod10(2, s2) * powMod10(5, s5)) % 10
            }
            xs[k] = a
        }
        return xs
    }

    fun hasSameDigits(s: String): Boolean {
        val n = s.length
        val xs = f(n - 2)
        val arr = IntArray(n)
        for (i in 0..<n) {
            arr[i] = s[i].code - '0'.code
        }
        var num1 = 0
        var num2 = 0
        for (i in 0..<n - 1) {
            num1 = (num1 + xs[i] * arr[i]) % 10
            num2 = (num2 + xs[i] * arr[i + 1]) % 10
        }
        return num1 == num2
    }
}
