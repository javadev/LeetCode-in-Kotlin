package g1101_1200.s1146_snapshot_array

import java.util.TreeMap

// #Medium #Array #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_18
class SnapshotArray(length: Int) {
    private var snapId = -1
    private val indexToSnapMap: MutableMap<Int, TreeMap<Int, Int>>
    private val ar: IntArray

    init {
        indexToSnapMap = HashMap()
        ar = IntArray(length)
    }

    operator fun set(index: Int, `val`: Int) {
        if (indexToSnapMap.containsKey(index)) {
            if (!indexToSnapMap[index]!!.containsKey(snapId)) {
                indexToSnapMap[index]!![snapId] = ar[index]
            }
        } else {
            val snapToValueMap = TreeMap<Int, Int>()
            snapToValueMap[snapId] = ar[index]
            indexToSnapMap[index] = snapToValueMap
        }
        ar[index] = `val`
    }

    fun snap(): Int {
        snapId++
        return snapId
    }

    operator fun get(index: Int, snapId: Int): Int {
        if (indexToSnapMap.containsKey(index)) {
            val value = indexToSnapMap[index]!!.ceilingEntry(snapId)
            if (value != null) {
                return value.value
            }
        }
        return ar[index]
    }
}
