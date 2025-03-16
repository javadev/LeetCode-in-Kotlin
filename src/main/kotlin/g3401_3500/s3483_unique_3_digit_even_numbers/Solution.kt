package g3401_3500.s3483_unique_3_digit_even_numbers

// #Easy #2025_03_16_Time_6_ms_(100.00%)_Space_44.99_MB_(100.00%)

class Solution {
    fun totalNumbers(digits: IntArray): Int {
        val set = HashSet<Int>()
        val n = digits.size
        for (i in 0..<n) {
            if (digits[i] == 0) {
                continue
            }
            for (j in 0..<n) {
                if (j == i) {
                    continue
                }
                for (k in 0..<n) {
                    if (k == i || k == j) {
                        continue
                    }
                    if (digits[k] % 2 == 0) {
                        val number = digits[i] * 100 + digits[j] * 10 + digits[k]
                        set.add(number)
                    }
                }
            }
        }
        return set.size
    }
}
