package g1901_2000.s1916_count_ways_to_build_rooms_in_an_ant_colony

// #Hard #Dynamic_Programming #Math #Tree #Graph #Topological_Sort #Combinatorics
// #2023_06_20_Time_2564_ms_(100.00%)_Space_94.2_MB_(100.00%)

import java.math.BigInteger

class Solution {
    private lateinit var graph: Array<MutableList<Int>?>
    private lateinit var fact: LongArray

    fun waysToBuildRooms(prevRoom: IntArray): Int {
        val n = prevRoom.size
        graph = Array(n) { mutableListOf<Int>() }
        fact = LongArray(prevRoom.size + 10)
        fact[1] = 1
        fact[0] = fact[1]
        for (i in 2 until fact.size) {
            fact[i] = fact[i - 1] * i
            fact[i] %= MOD.toLong()
        }
        for (i in 1 until prevRoom.size) {
            val pre = prevRoom[i]
            graph[pre]?.add(i)
        }
        val res = dfs(0)
        return (res[1] % MOD).toInt()
    }

    private fun dfs(root: Int): LongArray {
        val res = longArrayOf(1, 0)
        var cnt = 0
        val list: MutableList<LongArray> = ArrayList()
        for (next in graph[root]!!) {
            val v = dfs(next)
            cnt += v[0].toInt()
            list.add(v)
        }
        res[0] += cnt.toLong()
        var com: Long = 1
        for (p in list) {
            val choose = c(cnt, p[0].toInt())
            cnt -= p[0].toInt()
            com = com * choose
            com %= MOD.toLong()
            com = com * p[1]
            com %= MOD.toLong()
        }
        res[1] = com
        return res
    }

    private fun c(i: Int, j: Int): Long {
        val mod: Long = 1000000007
        val prevRoom = fact[i]
        val b = fact[i - j] % mod * (fact[j] % mod) % mod
        val value = BigInteger.valueOf(b)
        val binverse = value.modInverse(BigInteger.valueOf(mod)).toLong()
        return prevRoom * (binverse % mod) % mod
    }

    companion object {
        private const val MOD = 1000000007
    }
}
