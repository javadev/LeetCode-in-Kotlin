package g0301_0400.s0385_mini_parser

// #Medium #String #Depth_First_Search #Stack
// #2022_11_24_Time_210_ms_(100.00%)_Space_38.3_MB_(100.00%)

import com_github_leetcode.NestedInteger

/*
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * class NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     constructor()
 *
 *     // Constructor initializes a single integer.
 *     constructor(value: Int)
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     fun isInteger(): Boolean
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     fun getInteger(): Int?
 *
 *     // Set this NestedInteger to hold a single integer.
 *     fun setInteger(value: Int): Unit
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     fun add(ni: NestedInteger): Unit
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     fun getList(): List<NestedInteger>?
 * }
 */
class Solution {
    private var i = 0
    fun deserialize(s: String): NestedInteger {
        return getAns(s)
    }

    private fun getAns(s: String): NestedInteger {
        return if (s[i] == '[') {
            val ni = NestedInteger()
            i++
            while (i < s.length && s[i] != ']') {
                ni.add(getAns(s))
            }
            i++
            ni
        } else if (s[i] == ',') {
            i++
            getAns(s)
        } else {
            var x = 0
            var m = 1
            if (s[i] == '-') {
                i++
                m = -1
            }
            while (i < s.length && Character.isDigit(s[i])) {
                x = x * 10 + s[i++].code - '0'.code
            }
            x *= m
            NestedInteger(x)
        }
    }
}
