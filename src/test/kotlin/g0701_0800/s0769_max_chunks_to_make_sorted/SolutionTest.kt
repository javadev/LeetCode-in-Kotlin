package g0701_0800.s0769_max_chunks_to_make_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxChunksToSorted() {
        assertThat(Solution().maxChunksToSorted(intArrayOf(4, 3, 2, 1, 0)), equalTo(1))
    }

    @Test
    fun maxChunksToSorted2() {
        assertThat(Solution().maxChunksToSorted(intArrayOf(1, 0, 2, 3, 4)), equalTo(4))
    }
}
