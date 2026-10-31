package g3701_3800.s3757_number_of_effective_subsequences

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Combinatorics #Senior_Staff
// #Weekly_Contest_477 #2026_04_25_Time_128_ms_(95.71%)_Space_85.91_MB_(18.57%)

class Solution {
    fun countEffective(nums: IntArray): Int {
        val n = nums.size
        var t = 0
        for (v in nums) {
            t = t or v
        }
        if (t == 0) {
            return 0
        }
        val bits = IntArray(20)
        var m = 0
        for (b in 0..19) {
            if (((t shr b) and 1) != 0) {
                bits[m++] = b
            }
        }
        val s = 1 shl m
        val freq = IntArray(s)
        for (v in nums) {
            var m1 = 0
            for (j in 0..<m) {
                if (((v shr bits[j]) and 1) != 0) {
                    m1 = m1 or (1 shl j)
                }
            }
            freq[m1]++
        }
        val f = IntArray(s)
        System.arraycopy(freq, 0, f, 0, s)
        for (i in 0..<m) {
            for (mask in 0..<s) {
                if ((mask and (1 shl i)) != 0) {
                    f[mask] += f[mask xor (1 shl i)]
                }
            }
        }
        val p2 = LongArray(n + 1)
        p2[0] = 1
        for (i in 1..n) {
            p2[i] = (p2[i - 1] shl 1) % MOD
        }
        var ans: Long = 0
        val all = s - 1
        for (bmask in 1..<s) {
            val comp = all xor bmask
            val cnt = f[comp]
            val add = p2[cnt]
            if (Integer.bitCount(bmask) % 2 == 1) {
                ans = (ans + add) % MOD
            } else {
                ans = (ans - add) % MOD
            }
        }
        ans = (ans % MOD + MOD) % MOD
        return ans.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
