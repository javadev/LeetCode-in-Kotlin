package g0301_0400.s0306_additive_number

// #Medium #String #Backtracking #2022_11_25_Time_261_ms_(63.16%)_Space_35.9_MB_(5.26%)

class Solution {
    fun isAdditiveNumber(num: String): Boolean {
        if (num.isEmpty() || num.length < 3) {
            return false
        }

        fun isInvalid(s: String): Boolean {
            return s[0] == '0' && s.length > 1
        }

        fun backtrack(first: Long, second: Long, startIndex: Int): Boolean {
            val third = (first + second).toString()
            if (num.substring(startIndex).startsWith(third)) {
                if (third.length == num.length - startIndex) return true
                return backtrack(second, third.toLong(), startIndex + third.length)
            }
            return false
        }

        for (i in 1 until num.length) {
            val first = num.substring(0, i)
            if (isInvalid(first)) break
            for (j in i + 1 until num.length) {
                val second = num.substring(i, j)
                if (isInvalid(second)) break
                if (backtrack(first.toLong(), second.toLong(), j)) return true
            }
        }
        return false
    }
}
