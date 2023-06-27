package g2201_2300.s2222_number_of_ways_to_select_buildings

// #Medium #String #Dynamic_Programming #Prefix_Sum
// #2023_06_27_Time_261_ms_(100.00%)_Space_38.8_MB_(100.00%)

class Solution {
    fun numberOfWays(s: String): Long {
        var z: Long = 0
        var o: Long = 0
        var zo: Long = 0
        var oz: Long = 0
        var zoz: Long = 0
        var ozo: Long = 0
        for (c in s.toCharArray()) {
            if (c == '0') {
                zoz += zo
                oz += o
                z++
            } else {
                ozo += oz
                zo += z
                o++
            }
        }
        return zoz + ozo
    }
}
