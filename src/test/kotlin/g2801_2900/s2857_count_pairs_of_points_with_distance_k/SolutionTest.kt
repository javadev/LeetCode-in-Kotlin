package g2801_2900.s2857_count_pairs_of_points_with_distance_k

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        val input =
            listOf<List<Int>>(
                mutableListOf(1, 2),
                mutableListOf(4, 2),
                mutableListOf(1, 3),
                mutableListOf(5, 2)
            )
        MatcherAssert.assertThat(Solution().countPairs(input, 5), CoreMatchers.equalTo(2))
    }

    @Test
    fun countPairs2() {
        val input =
            listOf<List<Int>>(
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3),
                mutableListOf(1, 3)
            )
        MatcherAssert.assertThat(Solution().countPairs(input, 0), CoreMatchers.equalTo(10))
    }
}
