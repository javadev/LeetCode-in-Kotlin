package g2701_2800.s2745_construct_the_longest_new_string

// #Medium #Math #Greedy #Brainteaser #2023_08_08_Time_146_ms_(97.37%)_Space_33.6_MB_(94.74%)

class Solution {
    fun longestString(x: Int, y: Int, z: Int): Int {
        var first = x.coerceAtMost(y)
        var second = if (x == y) first else first + 1
        first = first shl 1
        second = second shl 1
        return first + second + (z shl 1)
    }
}
