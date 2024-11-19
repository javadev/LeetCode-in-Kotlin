package g2001_2100.s2089_find_target_indices_after_sorting_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun targetIndices() {
        assertThat(
            Solution().targetIndices(intArrayOf(1, 2, 5, 2, 3), 2),
            equalTo(listOf(1, 2)),
        )
    }

    @Test
    fun targetIndices2() {
        assertThat(
            Solution().targetIndices(intArrayOf(1, 2, 5, 2, 3), 3),
            equalTo(listOf(3)),
        )
    }

    @Test
    fun targetIndices3() {
        assertThat(
            Solution().targetIndices(intArrayOf(1, 2, 5, 2, 3), 5),
            equalTo(listOf(4)),
        )
    }
}
