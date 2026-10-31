package g3801_3900.s3852_smallest_pair_with_different_frequencies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistinctFreqPair() {
        assertThat<IntArray>(
            Solution().minDistinctFreqPair(intArrayOf(1, 1, 2, 2, 3, 4)),
            equalTo<IntArray>(intArrayOf(1, 3)),
        )
    }

    @Test
    fun minDistinctFreqPair2() {
        assertThat<IntArray>(
            Solution().minDistinctFreqPair(intArrayOf(1, 5)),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }

    @Test
    fun minDistinctFreqPair3() {
        assertThat<IntArray>(
            Solution().minDistinctFreqPair(intArrayOf(7)),
            equalTo<IntArray>(intArrayOf(-1, -1)),
        )
    }
}
