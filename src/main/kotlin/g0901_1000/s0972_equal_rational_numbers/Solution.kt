package g0901_1000.s0972_equal_rational_numbers

// #Hard #String #Math #2023_05_06_Time_130_ms_(100.00%)_Space_35.4_MB_(50.00%)

class Solution {
    private fun repeat(a: String): String {
        return a.repeat(100)
    }

    fun isRationalEqual(s: String, t: String): Boolean {
        val sLeftIndex = s.indexOf("(")
        val tLeftIndex = t.indexOf("(")

        if (sLeftIndex < 0 && tLeftIndex < 0) {
            return s.toDouble() == t.toDouble()
        }

        var sModified = s
        val sDouble: Double
        if (sLeftIndex >= 0) {
            val repeatingPart = s.substring(sLeftIndex + 1, s.length - 1)
            sModified = s.substring(0, sLeftIndex) + repeat(repeatingPart)

            sDouble = sModified.substring(0, minOf(sModified.length, 100)).toDouble()
        } else {
            sDouble = sModified.toDouble()
        }

        var tModified = t
        val tDouble: Double
        if (tLeftIndex >= 0) {
            val repeatingPart = t.substring(tLeftIndex + 1, t.length - 1)
            tModified = t.substring(0, tLeftIndex) + repeat(repeatingPart)

            tDouble = tModified.substring(0, minOf(tModified.length, 100)).toDouble()
        } else {
            tDouble = tModified.toDouble()
        }

        return sDouble == tDouble
    }
}
