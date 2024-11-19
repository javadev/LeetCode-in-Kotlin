package g1301_1400.s1365_how_many_numbers_are_smaller_than_the_current_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallerNumbersThanCurrent() {
        assertThat(
            Solution().smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)),
            equalTo(intArrayOf(4, 0, 1, 1, 3)),
        )
    }

    @Test
    fun smallerNumbersThanCurrent2() {
        assertThat(
            Solution().smallerNumbersThanCurrent(intArrayOf(6, 5, 4, 8)),
            equalTo(intArrayOf(2, 1, 0, 3)),
        )
    }

    @Test
    fun smallerNumbersThanCurrent3() {
        assertThat(
            Solution().smallerNumbersThanCurrent(intArrayOf(7, 7, 7, 7)),
            equalTo(intArrayOf(0, 0, 0, 0)),
        )
    }
}
