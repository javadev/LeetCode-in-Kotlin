package g3701_3800.s3734_lexicographically_smallest_palindromic_permutation_greater_than_target

// #Hard #String #Two_Pointers #Enumeration #Weekly_Contest_474
// #2025_11_05_Time_4_ms_(100.00%)_Space_46.12_MB_(77.78%)

class Solution {
    private fun func(i: Int, target: String, ans: CharArray, l: Int, r: Int, freq: IntArray, end: Boolean): Boolean {
        if (l > r) {
            return String(ans).compareTo(target) > 0
        }
        if (l == r) {
            var left = '#'
            for (k in 0 until 26) {
                if (freq[k] > 0) {
                    left = (k + 'a'.code).toChar()
                }
            }
            freq[left.code - 'a'.code]--
            ans[l] = left
            if (func(i + 1, target, ans, l + 1, r - 1, freq, end)) {
                return true
            }
            freq[left.code - 'a'.code]++
            ans[l] = '#'
            return false
        }
        if (end) {
            for (j in 0 until 26) {
                if (freq[j] > 1) {
                    freq[j] -= 2
                    val charJ = (j + 'a'.code).toChar()
                    ans[l] = charJ
                    ans[r] = charJ
                    if (func(i + 1, target, ans, l + 1, r - 1, freq, end)) {
                        return true
                    }
                    ans[l] = '#'
                    ans[r] = '#'
                    freq[j] += 2
                }
            }
            return false
        }
        val curr = target[i]
        var next = '1'
        for (k in (curr.code - 'a'.code + 1) until 26) {
            if (freq[k] > 1) {
                next = (k + 'a'.code).toChar()
                break
            }
        }
        if (freq[curr.code - 'a'.code] > 1) {
            ans[l] = curr
            ans[r] = curr
            freq[curr.code - 'a'.code] -= 2
            if (func(i + 1, target, ans, l + 1, r - 1, freq, false)) { // end = false
                return true
            }
            freq[curr.code - 'a'.code] += 2
        }
        if (next != '1') {
            ans[l] = next
            ans[r] = next
            freq[next.code - 'a'.code] -= 2
            if (func(i + 1, target, ans, l + 1, r - 1, freq, true)) { // end = true
                return true
            }
        }
        ans[l] = '#'
        ans[r] = '#'
        return false
    }

    fun lexPalindromicPermutation(s: String, target: String): String {
        val freq = IntArray(26)
        for (char in s) {
            freq[char.code - 'a'.code]++
        }
        var oddc = 0
        for (i in 0 until 26) {
            if (freq[i] % 2 == 1) {
                oddc++
            }
        }
        if (oddc > 1) {
            return ""
        }
        val ans = CharArray(s.length) { '#' }
        if (func(0, target, ans, 0, s.length - 1, freq, false)) {
            return String(ans)
        }
        return ""
    }
}
