package g3901_4000.s3901_good_subsequence_queries

// #Hard #Array #Math #Segment_Tree #Number_Theory #Principal #Weekly_Contest_497
// #2026_09_17_Time_20_ms_(100.00%)_Space_133.27_MB_(34.15%)

class Solution {
    private lateinit var tree: IntArray
    private var validCount = 0

    fun countGoodSubseq(nums: IntArray, p: Int, queries: Array<IntArray>): Int {
        val n = nums.size
        // 1. Iterative Segment Tree only needs 2n space
        tree = IntArray(2 * n)
        // Build the leaves of the tree and get initial count
        for (i in 0..<n) {
            if (nums[i] % p == 0) {
                tree[n + i] = nums[i]
                validCount++
            }
        }
        // Build the internal nodes bottom-up
        for (i in n - 1 downTo 1) {
            // tree[i << 1] is the left child, tree[i << 1 | 1] is the right child
            tree[i] = gcd(tree[i shl 1], tree[i shl 1 or 1])
        }
        var ans = 0
        for (q in queries) {
            val idx = q[0]
            val value = q[1]
            // 2. O(1) tracking for validCount (No segment tree needed for this!)
            val wasValid = (nums[idx] % p == 0)
            val isValid = (value % p == 0)
            if (wasValid && !isValid) {
                validCount--
            }
            if (!wasValid && isValid) {
                validCount++
            }
            // Update the original array to keep track of the old values
            nums[idx] = value
            // Point update for the Iterative Tree
            tree[idx + n] = if (isValid) value else 0
            // Climb up the tree using bitwise shifts (i >>= 1 means i = i / 2)
            var i = idx + n
            while (i > 1) {
                tree[i shr 1] = gcd(tree[i], tree[i xor 1])
                i = i shr 1
            }
            // 3. The logic check (tree[1] is ALWAYS the root in an iterative tree)
            if (tree[1] == p) {
                if (validCount < n) {
                    ans++
                } else {
                    // validCount == n (Every element is a multiple of p)
                    if (n > 20) {
                        // THE O(1) MATH BYPASS!
                        ans++
                    } else {
                        // Only run this heavy check if n is 20 or smaller
                        var flag = false
                        for (i in 0..<n) {
                            val leftGcd = query(0, i - 1, n)
                            val rightGcd = query(i + 1, n - 1, n)
                            if (gcd(leftGcd, rightGcd) == p) {
                                flag = true
                                break
                            }
                        }
                        if (flag) {
                            ans++
                        }
                    }
                }
            }
        }
        return ans
    }

    // Iterative Range Query [l, r] inclusive
    private fun query(l: Int, r: Int, n: Int): Int {
        var l = l
        var r = r
        if (l > r) {
            return 0
        }
        var res = 0
        l += n
        r += n + 1
        while (l < r) {
            if ((l and 1) == 1) {
                res = gcd(res, tree[l++])
            }
            if ((r and 1) == 1) {
                res = gcd(res, tree[--r])
            }
            l = l shr 1
            r = r shr 1
        }
        return res
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b
        while (b > 0) {
            val temp = b
            b = a % b
            a = temp
        }
        return a
    }
}
