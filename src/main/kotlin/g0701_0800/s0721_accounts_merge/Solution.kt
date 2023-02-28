package g0701_0800.s0721_accounts_merge

// #Medium #Array #String #Depth_First_Search #Breadth_First_Search #Union_Find
// #2023_02_28_Time_364_ms_(100.00%)_Space_45_MB_(90.91%)

import java.util.TreeSet

class Solution {
    class UnionFind(size: Int) {
        private var size: Int
        private var numComponents: Int
        private var rank: IntArray
        private var parent: IntArray
        init {
            require(size >= 0) { "Size <= 0 is not allowed" }
            this.size = size
            this.numComponents = size
            rank = IntArray(size) { 1 }
            parent = IntArray(size) { ind -> ind }
        }
        fun find(vertex: Int): Int {
            var root = parent[vertex]
            while (root != parent[root]) {
                parent[root] = parent[parent[root]]
                root = parent[root]
            }
            return root
        }
        fun union(vertex1: Int, vertex2: Int) {
            val firstRoot = find(vertex1)
            val secondRoot = find(vertex2)
            if (firstRoot == secondRoot) {
                return
            }
            if (rank[firstRoot] > rank[secondRoot]) {
                parent[secondRoot] = firstRoot
                rank[firstRoot] += rank[secondRoot]
            } else {
                parent[firstRoot] = secondRoot
                rank[secondRoot] += rank[firstRoot]
            }
            this.numComponents--
        }
        fun size(): Int {
            return size
        }
    }

    fun accountsMerge(accounts: List<List<String>>): List<List<String>> {
        val ownersMap = mutableMapOf<String, Int>()
        val unionFind = UnionFind(accounts.size)
        for (i in accounts.indices) {
            for (j in 1 until accounts[i].size) {
                val mail = accounts[i][j]
                if (!ownersMap.contains(mail)) {
                    ownersMap[mail] = i
                } else {
                    val previousAccount = ownersMap[mail]!!
                    unionFind.union(previousAccount, i)
                }
            }
        }
        val groupsMap = mutableMapOf<Int, TreeSet<String>>()
        for (ind in accounts.indices) {
            val parent = unionFind.find(ind)
            groupsMap.putIfAbsent(parent, TreeSet<String>())
            groupsMap[parent]!!.addAll(accounts[ind].subList(1, accounts[ind].size))
        }
        val res = mutableListOf<List<String>>()
        groupsMap.forEach { (key, value) ->
            val list = mutableListOf<String>()
            list.add(accounts[key][0])
            for (mail in value) {
                list.add(mail)
            }
            res.add(list)
        }
        return res
    }
}
