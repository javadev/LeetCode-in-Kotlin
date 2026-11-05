package g3901_4000.s3992_rearrange_string_to_avoid_character_pair

// #Easy #String #Sorting #Two_Pointers #Mid_Level #Biweekly_Contest_187
// #2026_11_03_Time_2_ms_(78.07%)_Space_44.54_MB_(91.27%)

class Solution {
    fun rearrangeString(s: String, x: Char, y: Char): String {
        val arr = s.toCharArray()
        var i = 0
        for (j in arr.indices) {
            if (arr[j] == y) {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
                i++
            }
        }
        return String(arr)
    }
}
