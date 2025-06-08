package g3501_3600.s3575_maximum_good_subtree_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodSubtreeSum() {
        assertThat<Int>(
            Solution().goodSubtreeSum(intArrayOf(2, 3), intArrayOf(-1, 0)),
            equalTo<Int>(8),
        )
    }

    @Test
    fun goodSubtreeSum2() {
        assertThat<Int>(
            Solution().goodSubtreeSum(intArrayOf(1, 5, 2), intArrayOf(-1, 0, 0)),
            equalTo<Int>(15),
        )
    }

    @Test
    fun goodSubtreeSum3() {
        assertThat<Int>(
            Solution().goodSubtreeSum(intArrayOf(34, 1, 2), intArrayOf(-1, 0, 1)),
            equalTo<Int>(42),
        )
    }

    @Test
    fun goodSubtreeSum4() {
        assertThat<Int>(
            Solution().goodSubtreeSum(intArrayOf(3, 22, 5), intArrayOf(-1, 0, 1)),
            equalTo<Int>(18),
        )
    }
}
