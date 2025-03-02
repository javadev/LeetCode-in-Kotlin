package g3401_3500.s3470_permutations_iv

// #Hard #2025_03_02_Time_63_ms_(100.00%)_Space_38.70_MB_(100.00%)

class Solution {
    private fun helper(a: Int, b: Int): Long {
        var res: Long = 1
        for (i in 0..<b) {
            res *= (a - i).toLong()
            if (res > INF) {
                return INF
            }
        }
        return res
    }

    private fun solve(odd: Int, even: Int, r: Int, req: Int): Long {
        if (r == 0) {
            return 1
        }
        val nOdd: Int
        val nEven: Int
        if (req == 1) {
            nOdd = (r + 1) / 2
            nEven = r / 2
        } else {
            nEven = (r + 1) / 2
            nOdd = r / 2
        }
        if (odd < nOdd || even < nEven) {
            return 0
        }
        val oddWays = helper(odd, nOdd)
        val evenWays = helper(even, nEven)
        var total = oddWays
        if (evenWays == 0L || total > INF / evenWays) {
            total = INF
        } else {
            total *= evenWays
        }
        return total
    }

    fun permute(n: Int, k: Long): IntArray {
        var k = k
        val ans: MutableList<Int> = ArrayList<Int>()
        var first = false
        val used = BooleanArray(n + 1)
        var odd = (n + 1) / 2
        var even = n / 2
        var last = -1
        for (i in 1..n) {
            if (!used[i]) {
                var odd2 = odd
                var even2 = even
                val cp = i and 1
                val next = (if (cp == 1) 0 else 1)
                if (cp == 1) {
                    odd2--
                } else {
                    even2--
                }
                val r = n - 1
                val cnt = solve(odd2, even2, r, next)
                if (k > cnt) {
                    k -= cnt
                } else {
                    ans.add(i)
                    used[i] = true
                    odd = odd2
                    even = even2
                    last = cp
                    first = true
                    break
                }
            }
        }
        if (!first) {
            return IntArray(0)
        }
        for (z in 1..<n) {
            for (j in 1..n) {
                if (!used[j] && ((j and 1) != last)) {
                    var odd2 = odd
                    var even2 = even
                    val cp = j and 1
                    if (cp == 1) {
                        odd2--
                    } else {
                        even2--
                    }
                    val r = n - (z + 1)
                    val next = (if (cp == 1) 0 else 1)
                    val cnt2 = solve(odd2, even2, r, next)
                    if (k > cnt2) {
                        k -= cnt2
                    } else {
                        ans.add(j)
                        used[j] = true
                        odd = odd2
                        even = even2
                        last = cp
                        break
                    }
                }
            }
        }
        return ans.stream().mapToInt { i: Int? -> i!! }.toArray()
    }

    companion object {
        private const val INF = 1000000000000000000L
    }
}
