package g3601_3700.s3660_jump_game_ix

// #Medium #Weekly_Contest_464 #2025_08_25_Time_205_ms_(100.00%)_Space_89.04_MB_(100.00%)

import java.util.ArrayDeque
import kotlin.math.max

class Solution {
    fun maxValue(nums: IntArray): IntArray {
        val n = nums.size
        val st = ArrayDeque<Int>()
        val uf = UnionFind(n)
        for (i in 0..<n) {
            var prev = i
            if (st.isNotEmpty()) {
                prev = st.peek()!!
            }
            while (st.isNotEmpty() && nums[i] < nums[st.peek()!!]) {
                uf.union(st.pop(), i)
            }
            if (nums[i] > nums[prev]) {
                st.push(i)
            } else {
                st.push(prev)
            }
        }
        st.clear()
        for (i in n - 1 downTo 0) {
            var prev = i
            if (st.isNotEmpty()) {
                prev = st.peek()!!
            }
            while (st.isNotEmpty() && nums[i] > nums[st.peek()!!]) {
                uf.union(st.pop(), i)
            }
            if (nums[i] < nums[prev]) {
                st.push(i)
            } else {
                st.push(prev)
            }
        }
        val map = HashMap<Int, Int>()
        for (i in 0..<n) {
            val root = uf.find(i)
            map.put(root, max(map.getOrDefault(root, Int.Companion.MIN_VALUE), nums[i]))
        }
        val ans = IntArray(n)
        for (i in 0..<n) {
            ans[i] = map[uf.find(i)]!!
        }
        return ans
    }

    private class UnionFind(n: Int) {
        var par: IntArray = IntArray(n)
        var rank: IntArray = IntArray(n)

        init {
            for (i in 0..<n) {
                par[i] = i
            }
        }

        fun find(x: Int): Int {
            if (par[x] != x) {
                par[x] = find(par[x])
            }
            return par[x]
        }

        fun union(x: Int, y: Int) {
            var x = x
            var y = y
            x = find(x)
            y = find(y)
            if (x == y) {
                return
            }
            if (rank[x] < rank[y]) {
                par[x] = y
            } else if (rank[x] > rank[y]) {
                par[y] = x
            } else {
                par[y] = x
                rank[x]++
            }
        }
    }
}
