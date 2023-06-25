package g2101_2200.s2154_keep_multiplying_found_values_by_two

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findFinalValue() {
        MatcherAssert.assertThat(Solution().findFinalValue(intArrayOf(5, 3, 6, 1, 12), 3), CoreMatchers.equalTo(24))
    }

    @Test
    fun findFinalValue2() {
        MatcherAssert.assertThat(Solution().findFinalValue(intArrayOf(2, 7, 9), 4), CoreMatchers.equalTo(4))
    }
}
