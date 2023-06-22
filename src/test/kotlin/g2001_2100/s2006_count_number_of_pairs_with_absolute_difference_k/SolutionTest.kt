package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKDifference() {
        MatcherAssert.assertThat(Solution().countKDifference(intArrayOf(1, 2, 2, 1), 1), CoreMatchers.equalTo(4))
    }

    @Test
    fun countKDifference2() {
        MatcherAssert.assertThat(Solution().countKDifference(intArrayOf(1, 3), 3), CoreMatchers.equalTo(0))
    }

    @Test
    fun countKDifference3() {
        MatcherAssert.assertThat(Solution().countKDifference(intArrayOf(3, 2, 1, 5, 4), 2), CoreMatchers.equalTo(3))
    }
}
