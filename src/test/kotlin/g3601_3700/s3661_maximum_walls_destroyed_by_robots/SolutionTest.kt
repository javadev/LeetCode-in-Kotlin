package g3601_3700.s3661_maximum_walls_destroyed_by_robots

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWalls() {
        assertThat<Int>(
            Solution().maxWalls(intArrayOf(4), intArrayOf(3), intArrayOf(1, 10)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun maxWalls2() {
        assertThat<Int>(
            Solution().maxWalls(intArrayOf(10, 2), intArrayOf(5, 1), intArrayOf(5, 2, 7)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxWalls3() {
        assertThat<Int>(
            Solution().maxWalls(intArrayOf(1, 2), intArrayOf(100, 1), intArrayOf(10)),
            equalTo<Int>(0),
        )
    }
}
