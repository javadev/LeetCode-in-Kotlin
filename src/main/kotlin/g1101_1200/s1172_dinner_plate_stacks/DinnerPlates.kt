package g1101_1200.s1172_dinner_plate_stacks

// #Hard #Hash_Table #Stack #Design #Heap_Priority_Queue
// #2023_05_25_Time_1160_ms_(50.00%)_Space_177.1_MB_(50.00%)

import java.util.Stack
import java.util.TreeSet

class DinnerPlates(private val stackCap: Int) {
    private val stacks: MutableList<Stack<Int>>
    private val leftIndex: TreeSet<Int>

    init {
        stacks = ArrayList()
        leftIndex = TreeSet()
    }

    fun push(`val`: Int) {
        if (leftIndex.isNotEmpty()) {
            val i = leftIndex.first()
            stacks[i].push(`val`)
            if (stacks[i].size == stackCap) {
                leftIndex.remove(i)
            }
            return
        }
        if (stacks.isEmpty() || stacks[stacks.size - 1].size == stackCap) {
            val newStack = Stack<Int>()
            stacks.add(newStack)
        }
        stacks[stacks.size - 1].push(`val`)
    }

    fun pop(): Int {
        if (stacks.isEmpty()) {
            return -1
        }
        while (stacks[stacks.size - 1].isEmpty()) {
            leftIndex.remove(stacks.size - 1)
            stacks.removeAt(stacks.size - 1)
        }
        val `val` = stacks[stacks.size - 1].pop()
        if (stacks[stacks.size - 1].isEmpty()) {
            leftIndex.remove(stacks.size - 1)
            stacks.removeAt(stacks.size - 1)
        }
        return `val`
    }

    fun popAtStack(index: Int): Int {
        if (stacks.size - 1 >= index) {
            var `val` = -1
            if (stacks[index].isNotEmpty()) {
                `val` = stacks[index].pop()
            }
            if (stacks[index].isEmpty() && index == stacks.size - 1) {
                leftIndex.remove(stacks.size - 1)
                stacks.removeAt(index)
                return `val`
            }
            leftIndex.add(index)
            return `val`
        }
        return -1
    }
}
