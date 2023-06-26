package g2101_2200.s2154_keep_multiplying_found_values_by_two

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findFinalValue() {
        assertThat(Solution().findFinalValue(intArrayOf(5, 3, 6, 1, 12), 3), equalTo(24))
    }

    @Test
    fun findFinalValue2() {
        assertThat(Solution().findFinalValue(intArrayOf(2, 7, 9), 4), equalTo(4))
    }
}
