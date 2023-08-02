package g0801_0900.s0848_shifting_letters

// #Medium #Array #String #2023_03_29_Time_537_ms_(93.75%)_Space_49.3_MB_(93.75%)

class Solution {
    fun shiftingLetters(s: String, shifts: IntArray): String {
        val n = shifts.size
        var runningSum = 0
        for (i in n - 1 downTo 0) {
            shifts[i] = (shifts[i] + runningSum) % 26
            runningSum = shifts[i]
        }
        val str = StringBuilder()
        var i = 0
        for (c in s.toCharArray()) {
            val correctShift = (c.code - 'a'.code + shifts[i]) % 26
            str.append(('a'.code + correctShift).toChar())
            i++
        }
        return str.toString()
    }
}
