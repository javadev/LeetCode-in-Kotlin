package g3401_3500.s3471_find_the_largest_almost_missing_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestInteger() {
        assertThat<Int>(
            Solution().largestInteger(intArrayOf(3, 9, 2, 1, 7), 3),
            equalTo<Int>(7),
        )
    }

    @Test
    fun largestInteger2() {
        assertThat<Int>(
            Solution().largestInteger(intArrayOf(3, 9, 7, 2, 1, 7), 4),
            equalTo<Int>(3),
        )
    }

    @Test
    fun largestInteger3() {
        assertThat<Int>(Solution().largestInteger(intArrayOf(0, 0), 1), equalTo<Int>(-1))
    }
}
