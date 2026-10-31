package g3801_3900.s3845_maximum_subarray_xor_with_bounded_range

// #Hard #Array #Bit_Manipulation #Prefix_Sum #Sliding_Window #Trie #Queue #Monotonic_Queue
// #Senior_Staff #Weekly_Contest_489 #2026_07_22_Time_130_ms_(98.70%)_Space_64.50_MB_(96.10%)

import java.util.ArrayDeque
import java.util.Deque
import kotlin.math.max

class Solution {
    companion object {
        private const val BITS = 15
    }

    class TrieNode {
        val next = arrayOfNulls<TrieNode>(2)
        var count = 0
    }

    private fun insert(root: TrieNode, num: Int) {
        var node = root
        for (i in BITS - 1 downTo 0) {
            val bit = (num ushr i) and 1
            if (node.next[bit] == null) {
                node.next[bit] = TrieNode()
            }
            node = node.next[bit]!!
            node.count++
        }
    }

    private fun remove(root: TrieNode, num: Int) {
        var node = root
        for (i in BITS - 1 downTo 0) {
            val bit = (num ushr i) and 1
            val child = node.next[bit]!!
            child.count--
            if (child.count == 0) {
                node.next[bit] = null
            }
            node = child
        }
    }

    private fun query(root: TrieNode, num: Int): Int {
        var node = root
        var res = 0
        for (i in BITS - 1 downTo 0) {
            val bit = (num ushr i) and 1
            val targetBit = bit xor 1
            if (node.next[targetBit] != null) {
                res = res or (1 shl i)
                node = node.next[targetBit]!!
            } else {
                node = node.next[bit]!!
            }
        }
        return res
    }

    fun maxXor(nums: IntArray, k: Int): Int {
        val n = nums.size
        val prefix = IntArray(n + 1)
        for (i in 0 until n) {
            prefix[i + 1] = prefix[i] xor nums[i]
        }
        val maxDeque: Deque<Int> = ArrayDeque()
        val minDeque: Deque<Int> = ArrayDeque()
        val root = TrieNode()
        var maxXor = 0
        var l = 0
        insert(root, 0)

        for (r in 0 until n) {
            // maintain max deque
            while (!maxDeque.isEmpty() && nums[r] > nums[maxDeque.peekLast()]) {
                maxDeque.pollLast()
            }
            maxDeque.offerLast(r)

            // maintain min deque
            while (!minDeque.isEmpty() && nums[r] < nums[minDeque.peekLast()]) {
                minDeque.pollLast()
            }
            minDeque.offerLast(r)

            // shrink window if max - min > k
            while (!maxDeque.isEmpty() &&
                !minDeque.isEmpty() &&
                nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k
            ) {
                remove(root, prefix[l])
                l++
                if (maxDeque.peekFirst() < l) {
                    maxDeque.pollFirst()
                }
                if (minDeque.peekFirst() < l) {
                    minDeque.pollFirst()
                }
            }
            // query and insert prefix[r + 1]
            maxXor = max(maxXor, query(root, prefix[r + 1]))
            insert(root, prefix[r + 1])
        }
        return maxXor
    }
}
