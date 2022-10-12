package g0101_0200.s0173_binary_search_tree_iterator

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class BSTIteratorTest {
    @Test
    fun iteratorBST() {
        val left = TreeNode(3)
        val right = TreeNode(15, TreeNode(9), TreeNode(20))
        val root = TreeNode(7, left, right)
        val iterator = BSTIterator(root)
        assertThat(iterator.next(), equalTo(3))
        assertThat(iterator.next(), equalTo(7))
        assertThat(iterator.hasNext(), equalTo(true))
        assertThat(iterator.next(), equalTo(9))
        assertThat(iterator.hasNext(), equalTo(true))
        assertThat(iterator.next(), equalTo(15))
        assertThat(iterator.hasNext(), equalTo(true))
        assertThat(iterator.next(), equalTo(20))
        assertThat(iterator.hasNext(), equalTo(false))
    }
}
