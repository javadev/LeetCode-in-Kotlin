package g3801_3900.s3840_house_robber_v

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rob() {
        assertThat<Long>(
            Solution().rob(intArrayOf(1, 4, 3, 5), intArrayOf(1, 1, 2, 2)),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun rob2() {
        assertThat<Long>(
            Solution().rob(intArrayOf(3, 1, 2, 4), intArrayOf(2, 3, 2, 2)),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun rob3() {
        assertThat<Long>(
            Solution().rob(intArrayOf(10, 1, 3, 9), intArrayOf(1, 1, 1, 2)),
            equalTo<Long>(22L),
        )
    }
}
