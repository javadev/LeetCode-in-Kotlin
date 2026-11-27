package g4001_4100.s4022_k_th_digit_in_infinite_string

// #Medium #Math #Binary_Search #Staff #Biweekly_Contest_189
// #2026_11_25_Time_2_ms_(88.89%)_Space_42.48_MB_(52.78%)

class Solution {
    fun kthDigit(k: Long): Int {
        if (k <= 9) {
            return k.toInt()
        }
        var remaining = k - 9
        var power10: Long = 10
        var d = 2
        while (true) {
            val firstBlock = power10 / 10
            val lastBlock = power10 - 1
            val numberOfBlocks = lastBlock - firstBlock + 1
            val digitsPerBlock = 10L * d
            val groupDigits = numberOfBlocks * digitsPerBlock
            if (remaining > groupDigits) {
                remaining -= groupDigits
                power10 *= 10
                d++
                continue
            }
            val zeroBased = remaining - 1
            val blockOffset = zeroBased / digitsPerBlock
            val positionInBlock = zeroBased % digitsPerBlock
            val b = firstBlock + blockOffset
            val numberIndex = positionInBlock / d
            val digitIndex = (positionInBlock % d).toInt()
            val number: Long
            if (b % 2 == 0L) {
                number = 10 * b + numberIndex
            } else {
                number = 10 * b + 9 - numberIndex
            }
            var divisor: Long = 1
            for (i in 0..<d - 1 - digitIndex) {
                divisor *= 10
            }
            return ((number / divisor) % 10).toInt()
        }
    }
}
