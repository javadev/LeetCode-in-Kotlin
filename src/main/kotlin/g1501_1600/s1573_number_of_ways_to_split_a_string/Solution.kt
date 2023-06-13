package g1501_1600.s1573_number_of_ways_to_split_a_string

// #Medium #String #Math
class Solution {
    fun numWays(s: String): Int {
        var totalOnesCount: Long = 0
        val mod: Long = 1000000007
        var waysOfFirstString: Long = 0
        var waysOfSecondString: Long = 0
        var onesCount: Long = 0
        val n = s.length.toLong()
        for (i in 0 until s.length) {
            if (s[i] == '1') {
                totalOnesCount += 1
            }
        }
        if (totalOnesCount % 3 != 0L) {
            return 0
        }
        val onesFirstPart = totalOnesCount / 3
        val onesSecondPart = onesFirstPart * 2
        if (totalOnesCount == 0L) {
            return ((n - 1) * (n - 2) / 2 % mod).toInt()
        }
        for (i in 0 until s.length) {
            if (s[i] == '1') {
                onesCount += 1
            }
            if (onesCount == onesFirstPart) {
                waysOfFirstString += 1
            } else if (onesCount == onesSecondPart) {
                waysOfSecondString += 1
            } else if (onesCount > onesSecondPart) {
                break
            }
        }
        return (waysOfFirstString * waysOfSecondString % mod).toInt()
    }
}
