package g2201_2300.s2276_count_integers_in_intervals

import java.util.TreeMap

// #Hard #Design #Ordered_Set #Segment_Tree
class CountIntervals {
    private val map: TreeMap<Int, Int> = TreeMap()
    private var count: Int

    init {
        map[-1] = -1
        map[1000000001] = 1000000001
        count = 0
    }

    fun add(left: Int, right: Int) {
        var left = left
        var right = right
        var item = if (map.floorEntry(left).value < left) map.ceilingEntry(left) else map.floorEntry(left)
        while (item.key <= right) {
            left = Math.min(left, item.key)
            right = Math.max(right, item.value)
            count -= item.value - item.key + 1
            map.remove(item.key)
            item = map.ceilingEntry(item.key)
        }
        map[left] = right
        count += right - left + 1
    }

    fun count(): Int {
        return count
    }
}
