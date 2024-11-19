package g3101_3200.s3131_find_the_integer_added_to_array_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addedInteger() {
        assertThat(
            Solution().addedInteger(intArrayOf(2, 6, 4), intArrayOf(9, 7, 5)),
            equalTo(3),
        )
    }

    @Test
    fun addedInteger2() {
        assertThat(Solution().addedInteger(intArrayOf(10), intArrayOf(5)), equalTo(-5))
    }

    @Test
    fun addedInteger3() {
        assertThat(
            Solution().addedInteger(intArrayOf(1, 1, 1, 1), intArrayOf(1, 1, 1, 1)),
            equalTo(0),
        )
    }
}
