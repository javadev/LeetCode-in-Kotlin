package g1101_1200.s1104_path_in_zigzag_labelled_binary_tree

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pathInZigZagTree() {
        MatcherAssert.assertThat(Solution().pathInZigZagTree(14), CoreMatchers.equalTo(mutableListOf(1, 3, 4, 14)))
    }

    @Test
    fun pathInZigZagTree2() {
        MatcherAssert.assertThat(Solution().pathInZigZagTree(26), CoreMatchers.equalTo(mutableListOf(1, 2, 6, 10, 26)))
    }
}
