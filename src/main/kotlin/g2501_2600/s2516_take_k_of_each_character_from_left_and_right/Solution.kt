package g2501_2600.s2516_take_k_of_each_character_from_left_and_right

// #Medium #String #Hash_Table #Sliding_Window
class Solution {
    fun takeCharacters(s: String, k: Int): Int {
        if (s.length < 3 * k) {
            return -1
        }
        val cnt = IntArray(3)
        val arr = s.toCharArray()
        for (ch in arr) {
            cnt[ch.code - 'a'.code]++
        }
        if (cnt[0] < k || cnt[1] < k || cnt[2] < k) {
            return -1
        }
        var ans = arr.size
        var i = 0
        var j = 0
        while (j < arr.size) {
            cnt[arr[j].code - 'a'.code]--
            if (cnt[0] >= k && cnt[1] >= k && cnt[2] >= k) {
                ans = Math.min(ans, arr.size - (j - i + 1))
                j++
            } else {
                cnt[arr[i].code - 'a'.code]++
                i++
                j++
            }
        }
        return ans
    }
}
