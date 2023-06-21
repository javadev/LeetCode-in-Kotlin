package g1801_1900.s1861_rotating_the_box

// #Medium #Array #Matrix #Two_Pointers
class Solution {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        val n = box.size
        val m = box[0].size
        val result = Array(m) { CharArray(n) }
        for (i in 0 until n) {
            var j = m - 1
            var idx = m - 1
            while (j >= 0) {
                if (box[i][j] == '#') {
                    result[j--][n - i - 1] = '.'
                    result[idx--][n - i - 1] = '#'
                } else {
                    val c = box[i][j]
                    result[j--][n - i - 1] = c
                    if (c == '*') {
                        idx = j
                    }
                }
            }
        }
        return result
    }
}
