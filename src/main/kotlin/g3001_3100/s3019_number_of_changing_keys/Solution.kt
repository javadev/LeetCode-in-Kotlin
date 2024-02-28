package g3001_3100.s3019_number_of_changing_keys

// #Easy #String #Breadth_First_Search #Graph #Prefix_Sum
// #2024_02_28_Time_157_ms_(80.52%)_Space_35.2_MB_(41.56%)

import java.util.Locale

@Suppress("NAME_SHADOWING")
class Solution {
    fun countKeyChanges(s: String): Int {
        var s = s
        s = s.lowercase(Locale.getDefault())
        var count = 0
        for (i in 0 until s.length - 1) {
            if (s[i] != s[i + 1]) {
                count++
            }
        }
        return count
    }
}
