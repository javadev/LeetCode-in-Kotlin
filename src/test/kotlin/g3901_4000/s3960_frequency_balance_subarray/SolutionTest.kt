package g3901_4000.s3960_frequency_balance_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getLength() {
        assertThat<Int>(
            Solution().getLength(intArrayOf(1, 2, 2, 1, 2, 3, 3, 3)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun getLength2() {
        assertThat<Int>(Solution().getLength(intArrayOf(5, 5, 5, 5)), equalTo<Int>(4))
    }

    @Test
    fun getLength3() {
        assertThat<Int>(Solution().getLength(intArrayOf(1, 2, 3, 4)), equalTo<Int>(1))
    }

    @Test
    fun getLength4() {
        assertThat<Int>(Solution().getLength(intArrayOf(1, 1)), equalTo<Int>(2))
    }
}
