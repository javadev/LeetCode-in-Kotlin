package g1201_1300.s1299_replace_elements_with_greatest_element_on_right_side

// #Easy #Array #2023_06_08_Time_514_ms_(79.69%)_Space_40.3_MB_(98.44%)

class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for (i in arr.indices.reversed()) {
            val temp = arr[i]
            arr[i] = max
            max = Math.max(max, temp)
        }
        return arr
    }
}
