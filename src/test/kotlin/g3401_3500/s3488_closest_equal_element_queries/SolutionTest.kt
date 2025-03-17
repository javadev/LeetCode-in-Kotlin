package g3401_3500.s3488_closest_equal_element_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solveQueries() {
        assertThat<List<Int>>(
            Solution().solveQueries(intArrayOf(1, 3, 1, 4, 1, 3, 2), intArrayOf(0, 3, 5)),
            equalTo<List<Int>>(listOf<Int>(2, -1, 3)),
        )
    }

    @Test
    fun solveQueries2() {
        assertThat<List<Int>>(
            Solution().solveQueries(intArrayOf(1, 2, 3, 4), intArrayOf(0, 1, 2, 3)),
            equalTo<List<Int>>(listOf<Int>(-1, -1, -1, -1)),
        )
    }
}
