package g2101_2200.s2167_minimum_time_to_remove_all_cars_containing_illegal_goods

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        assertThat(Solution().minimumTime("0010"), equalTo(2))
    }

    @Test
    fun minimumTime2() {
        assertThat(Solution().minimumTime("1100101"), equalTo(5))
    }
}
