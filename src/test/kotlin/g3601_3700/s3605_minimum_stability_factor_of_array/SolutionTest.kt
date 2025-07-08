package g3601_3700.s3605_minimum_stability_factor_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minStable() {
        assertThat<Int>(Solution().minStable(intArrayOf(3, 5, 10), 1), equalTo<Int>(1))
    }

    @Test
    fun minStable2() {
        assertThat<Int>(Solution().minStable(intArrayOf(2, 6, 8), 2), equalTo<Int>(1))
    }

    @Test
    fun minStable3() {
        assertThat<Int>(Solution().minStable(intArrayOf(2, 4, 9, 6), 1), equalTo<Int>(2))
    }
}
