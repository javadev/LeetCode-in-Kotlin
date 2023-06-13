package g1401_1500.s1483_kth_ancestor_of_a_tree_node

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Tree #Binary_Search #Design
class TreeAncestor(n: Int, parent: IntArray) {
    private val steps: MutableList<Int>
    private val stepMap: MutableMap<Int, IntArray>

    init {
        steps = ArrayList()
        stepMap = HashMap()
        steps.add(1)
        stepMap[1] = parent
        val stepBase = 10
        var step = stepBase
        while (step * 2 < n) {
            val stepArr = IntArray(n)
            val lastStepArr = stepMap[steps[steps.size - 1]]
            for (i in 0 until n) {
                var cur = i
                var repeat = 0
                while (repeat < stepBase && cur != -1) {
                    cur = lastStepArr!![cur]
                    repeat++
                }
                stepArr[i] = cur
            }
            steps.add(step)
            stepMap[step] = stepArr
            step *= stepBase
        }
    }

    fun getKthAncestor(node: Int, k: Int): Int {
        var node = node
        var k = k
        var index = steps.size - 1
        while (k > 0 && node != -1 && index >= 0) {
            val step = steps[index]
            val stepArr = stepMap[step]
            while (k >= step && node != -1) {
                node = stepArr!![node]
                k -= step
            }
            index--
        }
        return node
    }
}
