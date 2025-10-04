package g3601_3700.s3693_climbing_stairs_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun climbStairs() {
        assertThat<Int>(
            Solution().climbStairs(4, intArrayOf(1, 2, 3, 4)),
            equalTo<Int>(13),
        )
    }

    @Test
    fun climbStairs2() {
        assertThat<Int>(
            Solution().climbStairs(4, intArrayOf(5, 1, 6, 2)),
            equalTo<Int>(11),
        )
    }

    @Test
    fun climbStairs3() {
        assertThat<Int>(Solution().climbStairs(3, intArrayOf(9, 8, 3)), equalTo<Int>(12))
    }
}
