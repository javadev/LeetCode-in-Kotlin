package g0201_0300.s0297_serialize_and_deserialize_binary_tree

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CodecTest {
    @Test
    fun codec() {
        val treeNode = TreeNode(1, TreeNode(2), TreeNode(3, TreeNode(4), TreeNode(5)))
        val codec = Codec()
        val actual = codec.serialize(treeNode)
        assertThat(actual, equalTo("3e93ea**3eb3ec**3ed**"))
        val result: TreeNode? = codec.deserialize(actual)
        assertThat(result.toString(), equalTo("1,2,3,4,5"))
    }
}
