package g0401_0500.s0449_serialize_and_deserialize_bst

import com_github_leetcode.TreeNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CodecTest {
    @Test
    fun serializeDeserialize() {
        val expectedRoot = TreeNode(3)
        expectedRoot.left = TreeNode(1)
        expectedRoot.right = TreeNode(4)
        expectedRoot.left!!.right = TreeNode(2)
        assertThat(
            Codec().deserialize(Codec().serialize(expectedRoot)).toString(),
            equalTo(expectedRoot.toString()),
        )
        assertThat(
            Codec().deserialize(Codec().serialize(expectedRoot)).toString(),
            equalTo(expectedRoot.toString()),
        )
        assertThat(
            Codec().deserialize(Codec().serialize(expectedRoot)).toString(),
            equalTo(expectedRoot.toString()),
        )
        assertThat(
            Codec().deserialize(Codec().serialize(expectedRoot)).toString(),
            equalTo(expectedRoot.toString()),
        )
    }
}
