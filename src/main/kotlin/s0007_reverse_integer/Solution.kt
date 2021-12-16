package s0007_reverse_integer

class Solution {
    fun reverse(x: Int): Int {
    var rev:Long = 0
    var localX = x
    while (localX != 0)
    {
      rev = (rev * 10) + (localX % 10)
      localX /= 10
    }
    if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0
    return rev.toInt()
    }
}
