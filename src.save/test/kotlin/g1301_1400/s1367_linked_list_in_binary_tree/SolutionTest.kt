package g1301_1400.s1367_linked_list_in_binary_tree

import com_github_leetcode.LinkedListUtils.contructLinkedList
import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isSubPath() {
        val listNode = contructLinkedList(intArrayOf(4, 2, 8))
        val treeNode = TreeNode.create(
            mutableListOf(
                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                3
            )
        )
        assertThat(Solution().isSubPath(listNode, treeNode), equalTo(true))
    }

    @Test
    fun isSubPath2() {
        val listNode = contructLinkedList(intArrayOf(1, 4, 2, 6))
        val treeNode = TreeNode.create(
            mutableListOf(
                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                3
            )
        )
        assertThat(Solution().isSubPath(listNode, treeNode), equalTo(true))
    }

    @Test
    fun isSubPath3() {
        val listNode = contructLinkedList(intArrayOf(1, 4, 2, 6, 8))
        val treeNode = TreeNode.create(
            mutableListOf(
                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                3
            )
        )
        assertThat(Solution().isSubPath(listNode, treeNode), equalTo(false))
    }
}
