package g1401_1500.s1419_minimum_number_of_frogs_croaking

// #Medium #String #Counting
class Solution {
    fun minNumberOfFrogs(s: String): Int {
        var ans = 0
        val f = IntArray(26)
        for (i in 0 until s.length) {
            f[s[i].code - 'a'.code]++
            if (s[i] == 'k' && checkEnough(f)) {
                reduce(f)
            }
            if (!isValid(f)) {
                return -1
            }
            ans = Math.max(ans, getMax(f))
        }
        return if (isEmpty(f)) ans else -1
    }

    private fun checkEnough(f: IntArray): Boolean {
        return f['c'.code - 'a'.code] > 0 && f['r'.code - 'a'.code] > 0 &&
            f['o'.code - 'a'.code] > 0 && f[0] > 0 && f['k'.code - 'a'.code] > 0
    }

    fun reduce(f: IntArray) {
        f['c'.code - 'a'.code]--
        f['r'.code - 'a'.code]--
        f['o'.code - 'a'.code]--
        f[0]--
        f['k'.code - 'a'.code]--
    }

    private fun getMax(f: IntArray): Int {
        var max = 0
        for (v in f) {
            max = Math.max(max, v)
        }
        return max
    }

    private fun isEmpty(f: IntArray): Boolean {
        for (v in f) {
            if (v > 0) {
                return false
            }
        }
        return true
    }

    private fun isValid(f: IntArray): Boolean {
        if (f['r'.code - 'a'.code] > f['c'.code - 'a'.code]) {
            return false
        }
        if (f['o'.code - 'a'.code] > f['r'.code - 'a'.code]) {
            return false
        }
        return if (f[0] > f['o'.code - 'a'.code]) {
            false
        } else f['k'.code - 'a'.code] <= f[0]
    }
}
