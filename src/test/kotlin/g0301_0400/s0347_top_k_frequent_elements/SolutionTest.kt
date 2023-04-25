package g0301_0400.s0347_top_k_frequent_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun topKFrequent() {
        assertThat(
            Solution().topKFrequent(intArrayOf(1, 1, 1, 2, 2, 3), 2),
            equalTo(intArrayOf(1, 2))
        )
    }

    @Test
    fun topKFrequent2() {
        assertThat(Solution().topKFrequent(intArrayOf(1), 1), equalTo(intArrayOf(1)))
    }
}
