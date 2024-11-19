package g2801_2900.s2857_count_pairs_of_points_with_distance_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        val input =
            listOf<List<Int>>(
                mutableListOf(1, 2),
                mutableListOf(4, 2),
                mutableListOf(1, 3),
                mutableListOf(5, 2),
            )
        assertThat(Solution().countPairs(input, 5), equalTo(2))
    }

    @Test
    fun countPairs2() {
        val input =
            listOf<List<Int>>(
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3),
            )
        assertThat(Solution().countPairs(input, 0), equalTo(10))
    }
}
