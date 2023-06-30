package g2301_2400.s2326_spiral_matrix_iv

// #Medium #Array #Matrix #Simulation #Linked_List
// #2023_06_30_Time_908_ms_(66.67%)_Space_60.2_MB_(100.00%)

import com_github_leetcode.ListNode

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private enum class Direction {
        RIGHT, DOWN, LEFT, UP
    }

    fun spiralMatrix(m: Int, n: Int, head: ListNode?): Array<IntArray> {
        var head = head
        val arr = Array(m) { IntArray(n) }
        var i = 0
        var j = -1
        var direction = Direction.RIGHT
        // Boundaries
        // ++ after Left to right Horizontal traversed
        var a = 0
        // -- after Down to Up vertical traversed
        var b = n - 1
        // -- after Right to Left horizontal teversed
        var c = m - 1
        // ++ after Down to Up vertical traversed
        var d = 0
        for (k in 0 until m * n) {
            var `val` = -1
            if (head != null) {
                `val` = head.`val`
                head = head.next
            }
            when (direction) {
                Direction.RIGHT -> {
                    ++j
                    if (j == b) {
                        direction = Direction.DOWN
                        ++a
                    }
                }

                Direction.DOWN -> {
                    ++i
                    if (i == c) {
                        direction = Direction.LEFT
                    }
                }

                Direction.LEFT -> {
                    --j
                    if (j == d) {
                        --c
                        direction = Direction.UP
                    }
                }

                Direction.UP -> {
                    --i
                    if (i == a) {
                        --b
                        ++d
                        direction = Direction.RIGHT
                    }
                }

                else -> {
                    --i
                    if (i == a) {
                        --b
                        ++d
                        direction = Direction.RIGHT
                    }
                }
            }
            arr[i][j] = `val`
        }
        return arr
    }
}
