package g1701_1800.s1798_maximum_number_of_consecutive_values_you_can_make

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumConsecutive() {
        assertThat(Solution().getMaximumConsecutive(intArrayOf(1, 3)), equalTo(2))
    }

    @Test
    fun maximumConsecutive2() {
        assertThat(Solution().getMaximumConsecutive(intArrayOf(1, 1, 1, 4)), equalTo(8))
    }

    @Test
    fun maximumConsecutive3() {
        assertThat(Solution().getMaximumConsecutive(intArrayOf(1, 4, 10, 3, 1)), equalTo(20))
    }
}
