package g2001_2100.s2086_minimum_number_of_food_buckets_to_feed_the_hamsters

// #Medium #String #Dynamic_Programming #Greedy
// #2023_06_27_Time_208_ms_(100.00%)_Space_38.3_MB_(100.00%)

class Solution {
    fun minimumBuckets(street: String): Int {
        // check if houses have space in between or not
        // eg:".HHH."
        // array formation
        val arr = street.toCharArray()
        for (i in arr.indices) {
            if (arr[i] == '.') {
                continue
            }
            if (i + 1 < arr.size && arr[i + 1] == '.') {
                continue
            }
            // H is present before curr character
            if (i - 1 >= 0 && arr[i - 1] == '.') {
                continue
            }
            return -1
        }
        var x = 0
        for (j in arr.indices) {
            // point move next we only take care of H
            if (arr[j] == 'H') {
                if (j - 1 >= 0 && arr[j - 1] == 'X') {
                    continue
                }
                if (j + 1 < arr.size && arr[j + 1] == '.') {
                    arr[j + 1] = 'X'
                } else {
                    arr[j - 1] = 'X'
                }
                x++
            }
        }
        return x
    }
}
