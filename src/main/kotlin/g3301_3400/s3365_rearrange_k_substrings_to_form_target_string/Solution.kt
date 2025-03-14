package g3301_3400.s3365_rearrange_k_substrings_to_form_target_string

// #Medium #String #Hash_Table #Sorting #2025_03_14_Time_464_ms_(100.00%)_Space_55.32_MB_(100.00%)

class Solution {
    fun isPossibleToRearrange(s: String, t: String, k: Int): Boolean {
        val size = s.length
        val div = size / k
        val map: MutableMap<String, Int> = HashMap<String, Int>()
        run {
            var i = 0
            while (i < size) {
                val sub = s.substring(i, i + div)
                map.put(sub, map.getOrDefault(sub, 0) + 1)
                i += div
            }
        }
        var i = 0
        while (i < size) {
            val sub = t.substring(i, i + div)
            if (map.getOrDefault(sub, 0) > 0) {
                map.put(sub, map[sub]!! - 1)
            } else {
                return false
            }
            i += div
        }
        return true
    }
}
