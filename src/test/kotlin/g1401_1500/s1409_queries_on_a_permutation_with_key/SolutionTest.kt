package g1401_1500.s1409_queries_on_a_permutation_with_key

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun processQueries() {
        assertThat(
            Solution().processQueries(intArrayOf(3, 1, 2, 1), 5),
            equalTo(intArrayOf(2, 1, 2, 1)),
        )
    }

    @Test
    fun processQueries2() {
        assertThat(
            Solution().processQueries(intArrayOf(4, 1, 2, 2), 4),
            equalTo(intArrayOf(3, 1, 2, 0)),
        )
    }

    @Test
    fun processQueries3() {
        assertThat(
            Solution().processQueries(intArrayOf(7, 5, 5, 8, 3), 8),
            equalTo(intArrayOf(6, 5, 0, 7, 5)),
        )
    }
}
