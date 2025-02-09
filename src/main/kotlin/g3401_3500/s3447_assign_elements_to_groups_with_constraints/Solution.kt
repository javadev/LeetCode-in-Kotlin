package g3401_3500.s3447_assign_elements_to_groups_with_constraints

// #Medium #2025_02_09_Time_464_(100.00%)_Space_73.32_(100.00%)

import kotlin.math.min

class Solution {
    fun assignElements(groups: IntArray, elements: IntArray): IntArray {
        val elementIndexMap: MutableMap<Int, Int> = HashMap<Int, Int>()
        for (i in elements.indices) {
            elementIndexMap.putIfAbsent(elements[i], i)
        }
        val result = IntArray(groups.size)
        for (i in groups.indices) {
            result[i] = findSmallestIndex(groups[i], elementIndexMap)
        }
        return result
    }

    private fun findSmallestIndex(groupSize: Int, elementIndexMap: MutableMap<Int, Int>): Int {
        var minIndex = Int.Companion.MAX_VALUE
        var i = 1
        while (i * i <= groupSize) {
            if (groupSize % i == 0) {
                if (elementIndexMap.containsKey(i)) {
                    minIndex = min(minIndex, elementIndexMap[i]!!)
                }
                if (i != groupSize / i && elementIndexMap.containsKey(groupSize / i)) {
                    minIndex = min(minIndex, elementIndexMap[groupSize / i]!!)
                }
            }
            i++
        }
        return if (minIndex == Int.Companion.MAX_VALUE) -1 else minIndex
    }
}
