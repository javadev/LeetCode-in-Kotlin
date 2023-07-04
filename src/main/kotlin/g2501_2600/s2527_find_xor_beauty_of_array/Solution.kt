package g2501_2600.s2527_find_xor_beauty_of_array

// #Medium #Array #Math #Bit_Manipulation
class Solution {
    fun xorBeauty(arr: IntArray): Int {
        var i = 1
        while (i < arr.size) {
            arr[0] = arr[0] xor arr[i]
            i++
        }
        return arr[0]
    }
}
