package g1701_1800.s1702_maximum_binary_string_after_change

// #Medium #String #Greedy
class Solution {
    fun maximumBinaryString(binary: String): String {
        val bs = binary.toCharArray()
        var zcount = 0
        var pos = -1
        for (i in bs.indices.reversed()) {
            if (bs[i] == '0') {
                bs[i] = '1'
                zcount++
                pos = i
            }
        }
        if (pos >= 0) {
            bs[pos + zcount - 1] = '0'
        }
        return String(bs)
    }
}
