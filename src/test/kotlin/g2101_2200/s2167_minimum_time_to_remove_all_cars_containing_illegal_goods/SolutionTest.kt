package g2101_2200.s2167_minimum_time_to_remove_all_cars_containing_illegal_goods

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumTime() {
        MatcherAssert.assertThat(Solution().minimumTime("0010"), CoreMatchers.equalTo(2))
    }

    @Test
    fun minimumTime2() {
        MatcherAssert.assertThat(Solution().minimumTime("1100101"), CoreMatchers.equalTo(5))
    }
}
