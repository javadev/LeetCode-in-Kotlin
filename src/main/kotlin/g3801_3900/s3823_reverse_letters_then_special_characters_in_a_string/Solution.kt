package g3801_3900.s3823_reverse_letters_then_special_characters_in_a_string

// #Easy #String #Two_Pointers #Simulation #Mid_Level #Biweekly_Contest_175
// #2026_06_09_Time_1_ms_(100.00%)_Space_44.12_MB_(93.04%)

class Solution {
    fun reverseByType(s: String): String {
        val arr = s.toCharArray()
        var low = 0
        var high = arr.size - 1
        while (low < high) {
            if (arr[low] >= 'a' && arr[low] <= 'z' && arr[high] >= 'a' && arr[high] <= 'z') {
                val t = arr[low]
                arr[low] = arr[high]
                arr[high] = t
                low++
                high--
            } else if (arr[low] < 'a' || arr[low] > 'z') {
                low++
            } else {
                high--
            }
        }
        var i = 0
        var j = arr.size - 1
        while (i < j) {
            if ((arr[i] < 'a' || arr[i] > 'z') && (arr[j] < 'a' || arr[j] > 'z')) {
                val t = arr[i]
                arr[i] = arr[j]
                arr[j] = t
                i++
                j--
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                i++
            } else {
                j--
            }
        }
        return String(arr)
    }
}
