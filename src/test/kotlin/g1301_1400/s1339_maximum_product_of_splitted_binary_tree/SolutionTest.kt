package g1301_1400.s1339_maximum_product_of_splitted_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        val treeNode = TreeNode.create(mutableListOf(1, 2, 3, 4, 5, 6))
        assertThat(Solution().maxProduct(treeNode), equalTo(110))
    }

    @Test
    fun maxProduct2() {
        val treeNode = TreeNode.create(mutableListOf(1, null, 2, 3, 4, null, null, 5, 6))
        assertThat(Solution().maxProduct(treeNode), equalTo(90))
    }
}
