package g3701_3800.s3794_reverse_string_prefix

// #Easy #String #Two_Pointers #Mid_Level #Biweekly_Contest_173
// #2026_05_22_Time_1_ms_(100.00%)_Space_44.69_MB_(49.90%)

class Solution {
    fun reversePrefix(s: String, k: Int): String {
        val arr = s.toCharArray()
        for (i in 0..<k / 2) {
            val temp = arr[i]
            arr[i] = arr[k - 1 - i]
            arr[k - 1 - i] = temp
        }
        return String(arr)
    }
}
