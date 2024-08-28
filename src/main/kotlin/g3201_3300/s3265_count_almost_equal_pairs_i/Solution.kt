package g3201_3300.s3265_count_almost_equal_pairs_i

// #Medium #2024_08_28_Time_188_ms_(100.00%)_Space_37.5_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countPairs(nums: IntArray): Int {
        var ans = 0
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] ||
                    ((nums[j] - nums[i]) % 9 == 0 && check(nums[i], nums[j]))
                ) {
                    ans++
                }
            }
        }
        return ans
    }

    private fun check(a: Int, b: Int): Boolean {
        var a = a
        var b = b
        val ca = IntArray(10)
        val cb = IntArray(10)
        var d = 0
        while (a > 0 || b > 0) {
            if (a % 10 != b % 10) {
                d++
                if (d > 2) {
                    return false
                }
            }
            ca[a % 10]++
            cb[b % 10]++
            a /= 10
            b /= 10
        }
        return d == 2 && areEqual(ca, cb)
    }

    private fun areEqual(a: IntArray, b: IntArray): Boolean {
        for (i in 0..9) {
            if (a[i] != b[i]) {
                return false
            }
        }
        return true
    }
}
