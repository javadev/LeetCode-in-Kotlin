package g3801_3900.s3814_maximum_capacity_within_budget

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCapacity() {
        assertThat<Int>(
            Solution().maxCapacity(intArrayOf(4, 8, 5, 3), intArrayOf(1, 5, 2, 7), 8),
            equalTo<Int>(8),
        )
    }

    @Test
    fun maxCapacity2() {
        assertThat<Int>(
            Solution().maxCapacity(intArrayOf(3, 5, 7, 4), intArrayOf(2, 4, 3, 6), 7),
            equalTo<Int>(6),
        )
    }

    @Test
    fun maxCapacity3() {
        assertThat<Int>(
            Solution().maxCapacity(intArrayOf(2, 2, 2), intArrayOf(3, 5, 4), 5),
            equalTo<Int>(9),
        )
    }
}
