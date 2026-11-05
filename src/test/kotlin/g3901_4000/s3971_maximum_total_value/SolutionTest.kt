package g3901_4000.s3971_maximum_total_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotalValue() {
        assertThat<Int>(
            Solution().maxTotalValue(intArrayOf(6, 5, 4), intArrayOf(2, 1, 1), 4),
            equalTo<Int>(19),
        )
    }

    @Test
    fun maxTotalValue2() {
        assertThat<Int>(
            Solution().maxTotalValue(intArrayOf(7, 2, 2), intArrayOf(3, 2, 1), 2),
            equalTo<Int>(11),
        )
    }

    @Test
    fun maxTotalValue3() {
        assertThat<Int>(
            Solution().maxTotalValue(intArrayOf(4, 3), intArrayOf(5, 4), 5),
            equalTo<Int>(7),
        )
    }
}
