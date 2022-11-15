package g0301_0400.s0331_verify_preorder_serialization_of_a_binary_tree

// #Medium #String #Tree #Binary_Tree #Stack #2022_11_12_Time_335_ms_(70.00%)_Space_35.8_MB_(90.00%)

class Solution {
    fun isValidSerialization(preorder: String): Boolean {
        var count = 1
        val length = preorder.length
        for (i in 1..length) {
            if (i == length || preorder[i] == ',') {
                --count
                if (count < 0) {
                    return false
                }
                count += if (preorder[i - 1] == '#') 0 else 2
            }
        }
        return count == 0
    }
}
