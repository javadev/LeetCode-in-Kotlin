package g2501_2600.s2537_count_the_number_of_good_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGood() {
        assertThat(Solution().countGood(intArrayOf(1, 1, 1, 1, 1), 10), equalTo(1L))
    }

    @Test
    fun countGood2() {
        assertThat(Solution().countGood(intArrayOf(3, 1, 4, 3, 2, 2, 4), 2), equalTo(4L))
    }
}
