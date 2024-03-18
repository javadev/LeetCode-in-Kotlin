package g0301_0400.s0341_flatten_nested_list_iterator

// #Medium #Depth_First_Search #Tree #Stack #Design #Queue #Iterator #Programming_Skills_II_Day_18
// #2022_11_25_Time_210_ms_(100.00%)_Space_37.6_MB_(100.00%)

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
class NestedIterator(nestedList: List<NestedInteger>) {
    private var flattenList = mutableListOf<Int>()
    private var index = 0

    init {
        flatten(nestedList, flattenList)
    }

    private fun flatten(nestedList: List<NestedInteger>, flattenList: MutableList<Int>) {
        nestedList.forEach { nestedInteger ->
            if (nestedInteger.isInteger()) {
                flattenList.add(nestedInteger.getInteger()!!)
            } else {
                flatten(nestedInteger.getList()!!, flattenList)
            }
        }
    }

    fun next(): Int = flattenList[index++]

    fun hasNext(): Boolean = index < flattenList.size
}

/*
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */
