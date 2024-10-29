package g3301_3400.s3331_find_subtree_sizes_after_changes

// #Medium #Array #String #Hash_Table #Tree #Depth_First_Search
// #2024_10_29_Time_139_ms_(95.24%)_Space_82.2_MB_(19.05%)

class Solution {
    private lateinit var finalAns: IntArray

    fun findSubtreeSizes(parent: IntArray, s: String): IntArray {
        val n = parent.size
        val arr = s.toCharArray()
        val newParent = IntArray(n)
        finalAns = IntArray(n)
        val tree = HashMap<Int, ArrayList<Int>>()

        for (i in 1 until n) {
            var parentNode = parent[i]
            newParent[i] = parentNode
            while (parentNode != -1) {
                if (arr[parentNode] == arr[i]) {
                    newParent[i] = parentNode
                    break
                }
                parentNode = parent[parentNode]
            }
        }

        for (i in 1 until n) {
            if (!tree.containsKey(newParent[i])) {
                tree.put(newParent[i], ArrayList<Int>())
            }

            tree[newParent[i]]!!.add(i)
        }

        findNodes(0, tree)
        return finalAns
    }

    private fun findNodes(parent: Int, tree: HashMap<Int, ArrayList<Int>>): Int {
        var count = 1
        if (tree.containsKey(parent)) {
            for (i in tree[parent]!!) {
                count += findNodes(i, tree)
            }
        }
        finalAns[parent] = count
        return count
    }
}
