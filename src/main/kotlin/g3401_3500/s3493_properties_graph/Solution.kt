package g3401_3500.s3493_properties_graph

// #Medium #2025_03_23_Time_45_ms_(100.00%)_Space_65.05_MB_(60.00%)

import java.util.BitSet

class Solution {
    private lateinit var parent: IntArray

    fun numberOfComponents(properties: Array<IntArray>, k: Int): Int {
        val al = convertToList(properties)
        val n = al.size
        val bs: MutableList<BitSet> = ArrayList<BitSet>(n)
        for (integers in al) {
            val bitset = BitSet(101)
            for (num in integers) {
                bitset.set(num)
            }
            bs.add(bitset)
        }
        parent = IntArray(n)
        for (i in 0..<n) {
            parent[i] = i
        }
        for (i in 0..<n) {
            for (j in i + 1..<n) {
                val temp = bs[i].clone() as BitSet
                temp.and(bs[j])
                val common = temp.cardinality()
                if (common >= k) {
                    unionn(i, j)
                }
            }
        }
        val comps: MutableSet<Int> = HashSet<Int>()
        for (i in 0..<n) {
            comps.add(findp(i))
        }
        return comps.size
    }

    private fun findp(x: Int): Int {
        if (parent[x] != x) {
            parent[x] = findp(parent[x])
        }
        return parent[x]
    }

    private fun unionn(a: Int, b: Int) {
        val pa = findp(a)
        val pb = findp(b)
        if (pa != pb) {
            parent[pa] = pb
        }
    }

    private fun convertToList(arr: Array<IntArray>): MutableList<MutableList<Int>> {
        val list: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (row in arr) {
            val temp: MutableList<Int> = ArrayList<Int>()
            for (num in row) {
                temp.add(num)
            }
            list.add(temp)
        }
        return list
    }
}
