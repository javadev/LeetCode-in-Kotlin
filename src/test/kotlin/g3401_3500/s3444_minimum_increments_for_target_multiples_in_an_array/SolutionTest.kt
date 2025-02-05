package g3401_3500.s3444_minimum_increments_for_target_multiples_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumIncrements() {
        assertThat<Int>(
            Solution().minimumIncrements(intArrayOf(1, 2, 3), intArrayOf(4)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minimumIncrements2() {
        assertThat<Int>(
            Solution().minimumIncrements(intArrayOf(8, 4), intArrayOf(10, 5)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumIncrements3() {
        assertThat<Int>(
            Solution().minimumIncrements(intArrayOf(7, 9, 10), intArrayOf(7)),
            equalTo<Int>(0),
        )
    }
}
