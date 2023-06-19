package g1901_2000.s1923_longest_common_subpath

// #Hard #Array #Binary_Search #Hash_Function #Rolling_Hash #Suffix_Array
class Solution {
    private lateinit var pow: LongArray

    fun longestCommonSubpath(n: Int, paths: Array<IntArray>): Int {
        var res = 0
        var min = Int.MAX_VALUE
        for (path in paths) {
            min = Math.min(min, path.size)
        }
        pow = LongArray(min + 1)
        pow[0]++
        for (i in 1..min) {
            pow[i] = pow[i - 1] * BASE % MOD
        }
        var st = 1
        var end = min
        var mid = (st + end) / 2
        while (st <= end) {
            if (commonSubstring(paths, mid)) {
                res = mid
                st = mid + 1
            } else {
                end = mid - 1
            }
            mid = (st + end) / 2
        }
        return res
    }

    private fun commonSubstring(paths: Array<IntArray>, l: Int): Boolean {
        val set = rollingHash(paths[0], l)
        var i = 1
        val n = paths.size
        while (i < n) {
            set.retainAll(rollingHash(paths[i], l))
            if (set.isEmpty()) {
                return false
            }
            i++
        }
        return true
    }

    private fun rollingHash(a: IntArray, l: Int): HashSet<Long> {
        val set = HashSet<Long>()
        var hash: Long = 0
        for (i in 0 until l) {
            hash = (hash * BASE + a[i]) % MOD
        }
        set.add(hash)
        val n = a.size
        var curr = l
        var prev = 0
        while (curr < n) {
            hash = (hash * BASE % MOD - a[prev] * pow[l] % MOD + a[curr] + MOD) % MOD
            set.add(hash)
            prev++
            curr++
        }
        return set
    }

    companion object {
        private const val BASE: Long = 100001
        private val MOD = (Math.pow(10.0, 11.0) + 7).toLong()
    }
}
