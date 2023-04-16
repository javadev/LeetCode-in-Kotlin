package g0901_1000.s0919_complete_binary_tree_inserter

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CBTInserterTest {
    @Test
    fun cBTInserterTest() {
        val treeNode: TreeNode? = TreeNode.create(listOf(1, 2))
        val cBTInserter = CBTInserter(treeNode)
        assertThat(cBTInserter.insert(3), equalTo(1))
        assertThat(cBTInserter.insert(4), equalTo(2))
        val expected: TreeNode? = TreeNode.create(listOf(1, 2, 3, 4))
        assertThat(cBTInserter.get_root().toString(), equalTo(expected.toString()))
    }
}
