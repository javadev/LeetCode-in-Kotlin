package g1401_1500.s1413_minimum_value_to_get_positive_step_by_step_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minStartValue() {
        assertThat(Solution().minStartValue(intArrayOf(-3, 2, -3, 4, 2)), equalTo(5))
    }

    @Test
    fun minStartValue2() {
        assertThat(Solution().minStartValue(intArrayOf(1, 2)), equalTo(1))
    }

    @Test
    fun minStartValue3() {
        assertThat(Solution().minStartValue(intArrayOf(1, -2, -3)), equalTo(5))
    }
}
