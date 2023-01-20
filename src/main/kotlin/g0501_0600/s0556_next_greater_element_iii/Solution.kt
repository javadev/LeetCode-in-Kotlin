package g0501_0600.s0556_next_greater_element_iii

// #Medium #String #Math #Two_Pointers #Programming_Skills_II_Day_10
// #2023_01_20_Time_137_ms_(80.00%)_Space_32.6_MB_(60.00%)

class Solution {
    /*
    - What this problem wants is finding the next permutation of n
    - Steps to find the next permuation:
       find largest index k such that inp[k] < inp[k+1];
           if k == -1: return -1
           else:
               look for largest index l such that inp[l] > inp[k]
               swap the two index
               reverse from k+1 to n.length
       */
    fun nextGreaterElement(n: Int): Int {
        val inp = n.toString().toCharArray()
        // Find k
        var k = -1
        for (i in inp.size - 2 downTo 0) {
            if (inp[i] < inp[i + 1]) {
                k = i
                break
            }
        }
        if (k == -1) {
            return -1
        }
        // Find l
        var largerIdx = inp.size - 1
        for (i in inp.indices.reversed()) {
            if (inp[i] > inp[k]) {
                largerIdx = i
                break
            }
        }
        swap(inp, k, largerIdx)
        reverse(inp, k + 1, inp.size - 1)
        // Build result
        var ret = 0
        for (c in inp) {
            val digit = c.toInt() - '0'.toInt()
            // Handle the case if ret > Integer.MAX_VALUE - This idea is borrowed from problem  8.
            // String to Integer (atoi)
            if (ret > Int.MAX_VALUE / 10 || ret == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10) {
                return -1
            }
            ret = ret * 10 + (c.toInt() - '0'.toInt())
        }
        return ret
    }

    private fun swap(inp: CharArray, i: Int, j: Int) {
        val temp = inp[i]
        inp[i] = inp[j]
        inp[j] = temp
    }

    private fun reverse(inp: CharArray, start: Int, end: Int) {
        var start = start
        var end = end
        while (start < end) {
            val temp = inp[start]
            inp[start] = inp[end]
            inp[end] = temp
            start++
            end--
        }
    }
}
