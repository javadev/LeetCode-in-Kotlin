package g2501_2600.s2554_maximum_number_of_integers_to_choose_from_a_range_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCount() {
        assertThat(Solution().maxCount(intArrayOf(1, 6, 5), 5, 6), equalTo(2))
    }

    @Test
    fun maxCount2() {
        assertThat(Solution().maxCount(intArrayOf(1, 2, 3, 4, 5, 6, 7), 8, 1), equalTo(0))
    }

    @Test
    fun maxCount3() {
        assertThat(Solution().maxCount(intArrayOf(11), 7, 50), equalTo(7))
    }
}
