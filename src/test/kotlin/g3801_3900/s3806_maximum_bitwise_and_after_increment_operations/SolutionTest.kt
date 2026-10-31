package g3801_3900.s3806_maximum_bitwise_and_after_increment_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumAND() {
        assertThat<Int>(Solution().maximumAND(intArrayOf(3, 1, 2), 8, 2), equalTo<Int>(6))
    }

    @Test
    fun maximumAND2() {
        assertThat<Int>(
            Solution().maximumAND(intArrayOf(1, 2, 8, 4), 7, 3),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maximumAND3() {
        assertThat<Int>(Solution().maximumAND(intArrayOf(1, 1), 3, 2), equalTo<Int>(2))
    }
}
