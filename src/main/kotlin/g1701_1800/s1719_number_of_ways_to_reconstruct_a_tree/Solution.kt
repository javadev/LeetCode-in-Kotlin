package g1701_1800.s1719_number_of_ways_to_reconstruct_a_tree

// #Hard #Tree #Graph #Topological_Sort
class Solution {
    fun checkWays(pairs: Array<IntArray>): Int {
        val adj = Array(501) { IntArray(501) }
        val set = HashSet<Int>()
        for (pair in pairs) {
            adj[pair[0]][pair[1]]++
            adj[pair[1]][pair[0]]++
            set.add(pair[0])
            set.add(pair[1])
        }
        val n = set.size
        val num = IntArray(501)
        for (i in 0..500) {
            for (j in 0..500) {
                num[i] += adj[i][j]
            }
        }
        var c = 0
        for (i in 0..500) {
            if (num[i] == n - 1) {
                c++
            }
        }
        for (j in 0..500) {
            if (num[j] == n - 1) {
                num[j] = 0
                for (k in 0..500) {
                    if (adj[j][k] > 0) {
                        adj[j][k] = 0
                        adj[k][j] = 0
                        num[k]--
                    }
                }
                set.remove(j)
                break
            }
            if (j == 500) {
                return 0
            }
        }
        val res = search(adj, num, set)
        return if (res == 1 && c > 1) {
            2
        } else res
    }

    private fun search(adj: Array<IntArray>, num: IntArray, vals: HashSet<Int>): Int {
        if (vals.isEmpty()) {
            return 1
        }
        var max = 0
        for (i in vals) {
            if (num[i] > num[max]) {
                max = i
            }
        }
        val size = num[max]
        if (size == 0) {
            return 1
        }
        var c = false
        i@ for (i in vals) {
            if (num[i] == num[max]) {
                for (j in vals) {
                    if (j != i && num[j] == num[i] && adj[i][j] > 0) {
                        c = true
                        break@i
                    }
                }
            }
        }
        val set = HashSet<Int>()
        for (j in 0..500) {
            if (adj[max][j] > 0 && !vals.contains(j)) {
                return 0
            }
            if (adj[max][j] > 0) {
                adj[max][j] = 0
                adj[j][max] = 0
                num[j]--
                set.add(j)
            }
        }
        num[max] = 0
        val set2 = HashSet<Int>()
        for (i in vals) {
            if (!set.contains(i) && i != max) {
                set2.add(i)
            }
        }
        val res1 = search(adj, num, set)
        val res2 = search(adj, num, set2)
        if (res1 == 0 || res2 == 0) {
            return 0
        }
        return if (res1 == 2 || res2 == 2 || c) {
            2
        } else 1
    }
}
