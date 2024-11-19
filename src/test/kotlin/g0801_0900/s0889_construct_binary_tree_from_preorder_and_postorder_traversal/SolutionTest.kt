package g0801_0900.s0889_construct_binary_tree_from_preorder_and_postorder_traversal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun constructFromPrePost() {
        assertThat(
            Solution()
                .constructFromPrePost(intArrayOf(1, 2, 4, 5, 3, 6, 7), intArrayOf(4, 5, 2, 6, 7, 3, 1))
                .toString(),
            equalTo("1,2,4,5,3,6,7"),
        )
    }

    @Test
    fun constructFromPrePost2() {
        assertThat(
            Solution().constructFromPrePost(intArrayOf(1), intArrayOf(1)).toString(),
            equalTo("1"),
        )
    }
}
