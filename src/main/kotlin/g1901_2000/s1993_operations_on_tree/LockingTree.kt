package g1901_2000.s1993_operations_on_tree

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Design
// #2023_06_21_Time_1117_ms_(100.00%)_Space_67.9_MB_(100.00%)

import java.util.LinkedList

class LockingTree(parent: IntArray) {
    private val a: Array<IntArray>
    private val map = HashMap<Int, MutableList<Int>>()

    init {
        val l = parent.size
        a = Array(l) { IntArray(2) }
        for (i in 0 until l) {
            a[i][0] = parent[i]
            a[i][1] = -1
            map.putIfAbsent(parent[i], ArrayList())
            val p = map[parent[i]]!!
            p.add(i)
            map[parent[i]] = p
        }
    }

    fun lock(num: Int, user: Int): Boolean {
        val userId = a[num][1]
        if (userId == -1) {
            a[num][1] = user
            return true
        }
        return false
    }

    fun unlock(num: Int, user: Int): Boolean {
        val y = a[num][1]
        if (y == user) {
            a[num][1] = -1
            return true
        }
        return false
    }

    fun upgrade(num: Int, user: Int): Boolean {
        var par = num
        while (par >= 0) {
            val lop = a[par][1]
            if (lop != -1) {
                return false
            }
            par = a[par][0]
        }
        var f = 0
        val que = LinkedList<Int>()
        val v = IntArray(a.size)
        que.add(num)
        v[num] = 1
        while (que.isNotEmpty()) {
            val t = que[0]
            que.removeAt(0)
            val p: List<Int> = map.getOrDefault(t, ArrayList())
            for (e in p) {
                if (a[e][1] != -1) {
                    f = 1
                    a[e][1] = -1
                }
                if (v[e] == 0) {
                    que.add(e)
                    v[e] = 1
                }
            }
        }
        if (f == 1) {
            a[num][1] = user
            return true
        }
        return false
    }
}
/*
 * Your LockingTree object will be instantiated and called as such:
 * var obj = LockingTree(parent)
 * var param_1 = obj.lock(num,user)
 * var param_2 = obj.unlock(num,user)
 * var param_3 = obj.upgrade(num,user)
 */
