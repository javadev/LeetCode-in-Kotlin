package g3501_3600.s3528_unit_conversion_i

// #Medium #Depth_First_Search #Breadth_First_Search #Graph
// #2025_04_27_Time_3_ms_(100.00%)_Space_128.33_MB_(100.00%)

class Solution {
    fun baseUnitConversions(conversions: Array<IntArray>): IntArray {
        val arr = IntArray(conversions.size + 1)
        arr[0] = 1
        for (conversion in conversions) {
            val `val` = (arr[conversion[0]].toLong() * conversion[2]) % 1000000007
            arr[conversion[1]] = `val`.toInt()
        }
        return arr
    }
}
