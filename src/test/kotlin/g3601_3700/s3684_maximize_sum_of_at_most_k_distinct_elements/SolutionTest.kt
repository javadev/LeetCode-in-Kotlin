package g3601_3700.s3684_maximize_sum_of_at_most_k_distinct_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxKDistinct() {
        assertThat<IntArray>(
            Solution().maxKDistinct(intArrayOf(84, 93, 100, 77, 90), 3),
            equalTo<IntArray>(intArrayOf(100, 93, 90))
        )
    }

    @Test
    fun maxKDistinct2() {
        assertThat<IntArray>(
            Solution().maxKDistinct(intArrayOf(84, 93, 100, 77, 93), 3),
            equalTo<IntArray>(intArrayOf(100, 93, 84))
        )
    }

    @Test
    fun maxKDistinct3() {
        assertThat<IntArray>(
            Solution().maxKDistinct(intArrayOf(1, 1, 1, 2, 2, 2), 6),
            equalTo<IntArray>(intArrayOf(2, 1))
        )
    }
}
