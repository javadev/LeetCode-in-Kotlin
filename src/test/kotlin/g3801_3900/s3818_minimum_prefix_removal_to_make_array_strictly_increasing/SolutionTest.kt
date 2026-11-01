package g3801_3900.s3818_minimum_prefix_removal_to_make_array_strictly_increasing

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPrefixLength() {
        assertThat<Int>(
            Solution().minimumPrefixLength(intArrayOf(1, -1, 2, 3, 3, 4, 5)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minimumPrefixLength2() {
        assertThat<Int>(
            Solution().minimumPrefixLength(intArrayOf(4, 3, -2, -5)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minimumPrefixLength3() {
        assertThat<Int>(
            Solution().minimumPrefixLength(intArrayOf(1, 2, 3, 4)),
            equalTo<Int>(0),
        )
    }
}
