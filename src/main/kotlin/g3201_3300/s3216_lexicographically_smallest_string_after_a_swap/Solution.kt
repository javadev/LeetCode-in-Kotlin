package g3201_3300.s3216_lexicographically_smallest_string_after_a_swap

// #Easy #String #Greedy #2024_07_19_Time_157_ms_(95.16%)_Space_35.4_MB_(88.71%)

class Solution {
    fun getSmallestString(s: String): String {
        val arr = s.toCharArray()
        for (i in 1 until arr.size) {
            if (arr[i - 1].code % 2 == arr[i].code % 2 && arr[i - 1] > arr[i]) {
                val temp = arr[i]
                arr[i] = arr[i - 1]
                arr[i - 1] = temp
                break
            }
        }
        return String(arr)
    }
}
