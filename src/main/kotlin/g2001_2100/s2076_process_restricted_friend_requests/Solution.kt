package g2001_2100.s2076_process_restricted_friend_requests

// #Hard #Graph #Union_Find #2023_06_26_Time_355_ms_(100.00%)_Space_45.4_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun friendRequests(n: Int, restrictions: Array<IntArray>, requests: Array<IntArray>): BooleanArray {
        // Check for each request whether it can cause conflict or not
        val uf = UnionFind(n)
        val res = BooleanArray(requests.size)
        for (i in requests.indices) {
            val p1 = uf.findParent(requests[i][0])
            val p2 = uf.findParent(requests[i][1])
            if (p1 == p2) {
                res[i] = true
                continue
            }
            // Check whether the current request will violate any restriction or not
            var flag = true
            for (restrict in restrictions) {
                val r1 = uf.findParent(restrict[0])
                val r2 = uf.findParent(restrict[1])
                if (r1 == p1 && r2 == p2 || r1 == p2 && r2 == p1) {
                    flag = false
                    break
                }
            }
            if (flag) {
                res[i] = true
                // Union
                uf.parent[p1] = p2
            }
        }
        return res
    }

    private class UnionFind(n: Int) {
        var parent: IntArray = IntArray(n)

        init {
            for (i in 0 until n) {
                parent[i] = i
            }
        }

        fun findParent(user: Int): Int {
            var user = user
            while (parent[user] != user) {
                parent[user] = parent[parent[user]]
                user = parent[user]
            }
            return user
        }
    }
}
