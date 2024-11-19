package g0101_0200.s0108_convert_sorted_array_to_binary_search_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortedArrayToBST() {
        assertThat(
            Solution().sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9)).toString(),
            equalTo("0,-10,null,-3,5,null,9"),
        )
    }

    @Test
    fun sortedArrayToBST2() {
        assertThat(
            Solution().sortedArrayToBST(intArrayOf(1, 3)).toString(),
            equalTo("1,null,3"),
        )
    }
}
