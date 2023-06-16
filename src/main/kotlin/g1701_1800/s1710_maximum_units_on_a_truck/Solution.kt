package g1701_1800.s1710_maximum_units_on_a_truck

// #Easy #Array #Sorting #Greedy #2023_06_16_Time_228_ms_(100.00%)_Space_38.5_MB_(100.00%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        var truckSize = truckSize
        Arrays.sort(boxTypes) { b1: IntArray, b2: IntArray -> Integer.compare(b2[1], b1[1]) }
        var maxUnits = 0
        var i = 0
        while (truckSize > 0 && i < boxTypes.size) {
            if (boxTypes[i][0] <= truckSize) {
                maxUnits += boxTypes[i][0] * boxTypes[i][1]
                truckSize -= boxTypes[i][0]
            } else {
                maxUnits += Math.min(truckSize, boxTypes[i][0]) * boxTypes[i][1]
                truckSize -= Math.min(truckSize, boxTypes[i][0])
            }
            i++
        }
        return maxUnits
    }
}
