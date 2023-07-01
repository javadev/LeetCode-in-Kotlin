package g2301_2400.s2349_design_a_number_container_system

import java.util.TreeSet

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
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
