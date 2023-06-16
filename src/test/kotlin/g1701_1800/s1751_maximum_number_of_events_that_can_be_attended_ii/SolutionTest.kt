package g1701_1800.s1751_maximum_number_of_events_that_can_be_attended_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValue() {
        assertThat(
            Solution().maxValue(arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 1)), 2),
            equalTo(7)
        )
    }

    @Test
    fun maxValue2() {
        assertThat(
            Solution().maxValue(arrayOf(intArrayOf(1, 2, 4), intArrayOf(3, 4, 3), intArrayOf(2, 3, 10)), 2),
            equalTo(10)
        )
    }

    @Test
    fun maxValue3() {
        assertThat(
            Solution()
                .maxValue(
                    arrayOf(
                        intArrayOf(1, 1, 1), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3),
                        intArrayOf(4, 4, 4)
                    ),
                    3
                ),
            equalTo(9)
        )
    }
}
