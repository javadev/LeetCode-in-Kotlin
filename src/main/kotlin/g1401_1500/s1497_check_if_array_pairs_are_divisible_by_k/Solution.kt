package g1401_1500.s1497_check_if_array_pairs_are_divisible_by_k

// #Medium #Array #Hash_Table #Counting #2023_06_13_Time_575_ms_(83.33%)_Space_52.4_MB_(83.33%)

class Solution {
    fun canArrange(arr: IntArray, k: Int): Boolean {
        val freq = IntArray(k)
        for (num in arr) {
            freq[Math.abs(num % k + k) % k]++
        }
        if (freq[0] % 2 != 0) {
            return false
        }
        for (i in 1..k / 2) {
            if (i == k - i && freq[i] % 2 != 0) {
                return false
            }
            if (freq[i] != freq[k - i]) {
                return false
            }
        }
        return true
    }
}
