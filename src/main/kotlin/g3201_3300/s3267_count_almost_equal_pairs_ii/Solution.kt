package g3201_3300.s3267_count_almost_equal_pairs_ii

// #Hard #2024_08_28_Time_791_ms_(100.00%)_Space_50.7_MB_(57.14%)

class Solution {
    fun countPairs(nums: IntArray): Int {
        var pairs = 0
        val counts: MutableMap<Int, Int> = HashMap()
        nums.sort()
        for (num in nums) {
            val newNums: MutableSet<Int> = HashSet()
            newNums.add(num)
            var unit1 = 1
            var remain1 = num
            while (remain1 > 0) {
                val digit1 = num / unit1 % 10
                var unit2 = unit1 * 10
                var remain2 = remain1 / 10
                while (remain2 > 0
                ) {
                    val digit2 = num / unit2 % 10
                    val newNum1 =
                        num - digit1 * unit1 - digit2 * unit2 + digit2 * unit1 + digit1 * unit2
                    newNums.add(newNum1)
                    var unit3 = unit1 * 10
                    var remain3 = remain1 / 10
                    while (remain3 > 0
                    ) {
                        val digit3 = newNum1 / unit3 % 10
                        var unit4 = unit3 * 10
                        var remain4 = remain3 / 10
                        while (remain4 > 0
                        ) {
                            val digit4 = newNum1 / unit4 % 10
                            val newNum2 =
                                newNum1 - digit3 * unit3 - digit4 * unit4 + digit4 * unit3 + digit3 * unit4
                            newNums.add(newNum2)
                            unit4 *= 10
                            remain4 /= 10
                        }
                        unit3 *= 10
                        remain3 /= 10
                    }
                    unit2 *= 10
                    remain2 /= 10
                }
                unit1 *= 10
                remain1 /= 10
            }
            for (newNum in newNums) {
                pairs += counts.getOrDefault(newNum, 0)
            }
            counts[num] = counts.getOrDefault(num, 0) + 1
        }
        return pairs
    }
}
