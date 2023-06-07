package g1401_1500.s1415_the_k_th_lexicographical_string_of_all_happy_strings_of_length_n

// #Medium #String #Backtracking
class Solution {
    private val arr = charArrayOf('a', 'b', 'c')
    private var res = ""
    private var k = 0
    private operator fun get(str: StringBuilder, n: Int, index: Int) {
        if (k < 1) {
            return
        }
        if (str.length == n) {
            if (k == 1) {
                res = str.toString()
            }
            k--
            return
        }
        for (i in 0..2) {
            if (i == index) {
                continue
            }
            str.append(arr[i])
            get(str, n, i)
            str.deleteCharAt(str.length - 1)
        }
    }

    fun getHappyString(n: Int, k: Int): String {
        this.k = k
        get(StringBuilder(), n, -1)
        return res
    }
}
