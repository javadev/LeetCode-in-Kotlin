package g1101_1200.s1104_path_in_zigzag_labelled_binary_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathInZigZagTree() {
        assertThat(Solution().pathInZigZagTree(14), equalTo(mutableListOf(1, 3, 4, 14)))
    }

    @Test
    fun pathInZigZagTree2() {
        assertThat(Solution().pathInZigZagTree(26), equalTo(mutableListOf(1, 2, 6, 10, 26)))
    }
}
