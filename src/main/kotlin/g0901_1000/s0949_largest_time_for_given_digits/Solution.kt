package g0901_1000.s0949_largest_time_for_given_digits

// #Medium #String #Enumeration #2023_05_01_Time_171_ms_(100.00%)_Space_36.6_MB_(100.00%)

class Solution {
    fun largestTimeFromDigits(arr: IntArray): String {
        val buf = StringBuilder()
        var maxHour: String? = ""
        for (i in 0..3) {
            for (j in 0..3) {
                if (i != j) {
                    val hour = getTime(arr, i, j, 23, false)
                    val min = getTime(arr, i, j, 59, true)
                    if (hour != null && min != null && hour > maxHour!!) {
                        buf.setLength(0)
                        buf.append(hour).append(':').append(min)
                        maxHour = hour
                    }
                }
            }
        }
        return buf.toString()
    }

    private fun getTime(arr: IntArray, i: Int, j: Int, limit: Int, exclude: Boolean): String? {
        var n1 = -1
        var n2 = -1
        for (k in 0..3) {
            if (exclude && k != i && k != j || !exclude && (k == i || k == j)) {
                if (n1 == -1) {
                    n1 = arr[k]
                } else {
                    n2 = arr[k]
                }
            }
        }
        var s1: String? = n1.toString() + n2
        var s2: String? = n2.toString() + n1
        var v1 = s1!!.toInt()
        if (v1 > limit) {
            v1 = -1
            s1 = null
        }
        var v2 = s2!!.toInt()
        if (v2 > limit) {
            v2 = -1
            s2 = null
        }
        return if (v1 >= v2) s1 else s2
    }
}
