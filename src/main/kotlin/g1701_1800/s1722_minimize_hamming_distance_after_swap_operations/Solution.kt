package g1701_1800.s1722_minimize_hamming_distance_after_swap_operations

// #Medium #Array #Depth_First_Search #Union_Find
class Solution {
    fun minimumHammingDistance(source: IntArray, target: IntArray, allowedSwaps: Array<IntArray>): Int {
        var i: Int
        val n = source.size
        var weight = 0
        val parent = IntArray(n)
        i = 0
        while (i < n) {
            parent[i] = i
            i++
        }
        for (swap in allowedSwaps) {
            union(swap[0], swap[1], parent)
        }
        val components = HashMap<Int, MutableList<Int>>()
        i = 0
        while (i < n) {
            find(i, parent)
            val list = components.getOrDefault(parent[i], ArrayList())
            list.add(i)
            components[parent[i]] = list
            i++
        }
        for ((_, value) in components) {
            weight += getHammingDistance(source, target, value)
        }
        return weight
    }

    private fun getHammingDistance(source: IntArray, target: IntArray, indices: List<Int>): Int {
        val list1 = HashMap<Int, Int>()
        val list2 = HashMap<Int, Int>()
        for (i in indices) {
            list1[target[i]] = 1 + list1.getOrDefault(target[i], 0)
            list2[source[i]] = 1 + list2.getOrDefault(source[i], 0)
        }
        var size = indices.size
        for ((key, value) in list1) {
            size -= Math.min(value, list2.getOrDefault(key, 0))
        }
        return size
    }

    private fun union(x: Int, y: Int, parent: IntArray) {
        if (x != y) {
            val a = find(x, parent)
            val b = find(y, parent)
            if (a != b) {
                parent[a] = b
            }
        }
    }

    private fun find(x: Int, parent: IntArray): Int {
        var y = x
        while (y != parent[y]) {
            y = parent[y]
        }
        parent[x] = y
        return y
    }
}
