package g2001_2100.s2092_find_all_people_with_secret

// #Hard #Sorting #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2023_06_28_Time_1086_ms_(100.00%)_Space_104.2_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findAllPeople(n: Int, meetings: Array<IntArray>, firstPerson: Int): List<Int> {
        meetings.sortWith { a: IntArray, b: IntArray -> a[2] - b[2] }
        val uf = UF(n)
        // base
        uf.union(0, firstPerson)
        // for every time we have a pool of people that talk to each other
        // if someone knows a secret proir to this meeting - all pool will too
        // if not - reset unions from this pool
        var i = 0
        while (i < meetings.size) {
            val curTime = meetings[i][2]
            val pool: MutableSet<Int> = HashSet()
            while (i < meetings.size && curTime == meetings[i][2]) {
                val currentMeeting = meetings[i]
                uf.union(currentMeeting[0], currentMeeting[1])
                pool.add(currentMeeting[0])
                pool.add(currentMeeting[1])
                i++
            }
            // meeting that took place now should't affect future
            // meetings if people don't know the secret
            for (j in pool) {
                if (!uf.connected(0, j)) {
                    uf.reset(j)
                }
            }
        }
        // if the person is conneted to 0 - they know a secret
        val ans: MutableList<Int> = ArrayList()
        for (j in 0 until n) {
            if (uf.connected(j, 0)) {
                ans.add(j)
            }
        }
        return ans
    }

    // regular union find
    private class UF(n: Int) {
        private val parent: IntArray
        private val rank: IntArray

        init {
            parent = IntArray(n)
            rank = IntArray(n)
            for (i in 0 until n) {
                parent[i] = i
            }
        }

        fun union(p: Int, q: Int) {
            val rootP = find(p)
            val rootQ = find(q)
            if (rootP == rootQ) {
                return
            }
            if (rank[rootP] < rank[rootQ]) {
                parent[rootP] = rootQ
            } else {
                parent[rootQ] = rootP
                rank[rootP]++
            }
        }

        fun find(p: Int): Int {
            var p = p
            while (parent[p] != p) {
                p = parent[parent[p]]
            }
            return p
        }

        fun connected(p: Int, q: Int): Boolean {
            return find(p) == find(q)
        }

        fun reset(p: Int) {
            parent[p] = p
            rank[p] = 0
        }
    }
}
