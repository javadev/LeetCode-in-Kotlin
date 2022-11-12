package g0301_0400.s0321_create_maximum_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumber() {
        assertThat(
            Solution().maxNumber(intArrayOf(3, 4, 6, 5), intArrayOf(9, 1, 2, 5, 8, 3), 5),
            equalTo(intArrayOf(9, 8, 6, 5, 3))
        )
    }

    @Test
    fun maxNumber2() {
        assertThat(
            Solution().maxNumber(intArrayOf(6, 7), intArrayOf(6, 0, 4), 5),
            equalTo(intArrayOf(6, 7, 6, 0, 4))
        )
    }

    @Test
    fun maxNumber3() {
        assertThat(
            Solution().maxNumber(intArrayOf(3, 9), intArrayOf(8, 9), 3),
            equalTo(intArrayOf(9, 8, 9))
        )
    }
}
