package g2001_2100.s2006_count_number_of_pairs_with_absolute_difference_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKDifference() {
        assertThat(Solution().countKDifference(intArrayOf(1, 2, 2, 1), 1), equalTo(4))
    }

    @Test
    fun countKDifference2() {
        assertThat(Solution().countKDifference(intArrayOf(1, 3), 3), equalTo(0))
    }

    @Test
    fun countKDifference3() {
        assertThat(Solution().countKDifference(intArrayOf(3, 2, 1, 5, 4), 2), equalTo(3))
    }
}
