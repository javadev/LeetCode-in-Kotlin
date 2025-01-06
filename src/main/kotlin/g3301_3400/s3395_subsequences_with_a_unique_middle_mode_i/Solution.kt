package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i

// #Hard #Array #Hash_Table #Math #Combinatorics #2025_01_06_Time_49_(100.00%)_Space_41.14_(100.00%)

class Solution {
    private val c2 = LongArray(1001)

    fun subsequencesWithMiddleMode(nums: IntArray): Int {
        if (c2[2] == 0L) {
            c2[1] = 0
            c2[0] = c2[1]
            c2[2] = 1
            for (i in 3..<c2.size) {
                c2[i] = (i * (i - 1) / 2).toLong()
            }
        }
        val n = nums.size
        val newNums = IntArray(n)
        val map: MutableMap<Int?, Int?> = HashMap<Int?, Int?>(n)
        var m = 0
        var index = 0
        for (x in nums) {
            var id = map[x]
            if (id == null) {
                id = m++
                map.put(x, id)
            }
            newNums[index++] = id
        }
        if (m == n) {
            return 0
        }
        val rightCount = IntArray(m)
        for (x in newNums) {
            rightCount[x]++
        }
        val leftCount = IntArray(m)
        var ans = n.toLong() * (n - 1) * (n - 2) * (n - 3) * (n - 4) / 120
        for (left in 0..<n - 2) {
            val x = newNums[left]
            rightCount[x]--
            if (left >= 2) {
                val right = n - (left + 1)
                val leftX = leftCount[x]
                val rightX = rightCount[x]
                ans -= c2[left - leftX] * c2[right - rightX]
                for (y in 0..<m) {
                    if (y == x) {
                        continue
                    }
                    val rightY = rightCount[y]
                    val leftY = leftCount[y]
                    ans -= c2[leftY] * rightX * (right - rightX)
                    ans -= c2[rightY] * leftX * (left - leftX)
                    ans -=
                        (
                            leftY
                                * rightY
                                * (
                                    leftX * (right - rightX - rightY) +
                                        rightX * (left - leftX - leftY)
                                    )
                            ).toLong()
                }
            }
            leftCount[x]++
        }
        return (ans % MOD).toInt()
    }

    companion object {
        private val MOD = 1e9.toInt() + 7
    }
}
