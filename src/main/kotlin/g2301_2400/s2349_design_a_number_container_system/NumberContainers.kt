package g2301_2400.s2349_design_a_number_container_system

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
// #2023_07_01_Time_1011_ms_(100.00%)_Space_129_MB_(100.00%)

import java.util.TreeSet

class NumberContainers {
    private val indices: MutableMap<Int, TreeSet<Int>> = HashMap()
    private val vals: MutableMap<Int, Int> = HashMap()
    fun change(index: Int, number: Int) {
        if (vals.containsKey(index)) {
            val old = vals[index]!!
            indices[old]!!.remove(index)
            if (indices[old]!!.isEmpty()) {
                indices.remove(old)
            }
        }
        vals[index] = number
        indices.computeIfAbsent(number) { _: Int? -> TreeSet() }.add(index)
    }

    fun find(number: Int): Int {
        return if (indices.containsKey(number)) {
            indices[number]!!.first()
        } else -1
    }
}
/*
 * Your NumberContainers object will be instantiated and called as such:
 * var obj = NumberContainers()
 * obj.change(index,number)
 * var param_2 = obj.find(number)
 */
