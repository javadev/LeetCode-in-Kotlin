package g3601_3700.s3661_maximum_walls_destroyed_by_robots

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWalls() {
        assertThat(
            Solution().maxWalls(intArrayOf(4), intArrayOf(3), intArrayOf(1, 10)),
            equalTo(1),
        )
    }

    @Test
    fun maxWalls2() {
        assertThat(
            Solution().maxWalls(intArrayOf(10, 2), intArrayOf(5, 1), intArrayOf(5, 2, 7)),
            equalTo(3),
        )
    }

    @Test
    fun maxWalls3() {
        assertThat(
            Solution().maxWalls(intArrayOf(1, 2), intArrayOf(100, 1), intArrayOf(10)),
            equalTo(0),
        )
    }

    @Test
    fun maxWalls4() {
        val robots = intArrayOf(5)
        val distance = intArrayOf(3)
        val walls = intArrayOf()
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(0))
    }

    @Test
    fun maxWalls5() {
        val robots = intArrayOf(5)
        val distance = intArrayOf(3)
        val walls = intArrayOf(2, 4, 5, 6, 8)
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(3))
    }

    @Test
    fun maxWalls6() {
        val robots = intArrayOf(10)
        val distance = intArrayOf(2)
        val walls = intArrayOf(7, 8, 9, 10, 11, 13)
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(3))
    }

    @Test
    fun maxWalls7() {
        val robots = intArrayOf(5, 15)
        val distance = intArrayOf(2, 2)
        val walls = intArrayOf(4, 5, 6, 14, 15, 16)
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(4))
    }

    @Test
    fun maxWalls8() {
        val robots = intArrayOf(5, 8)
        val distance = intArrayOf(5, 5)
        val walls = intArrayOf(2, 4, 5, 6, 7, 8, 9, 10)
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(6))
    }

    @Test
    fun maxWalls9() {
        val robots = intArrayOf(3, 10, 20)
        val distance = intArrayOf(2, 3, 4)
        val walls = intArrayOf(1, 2, 3, 4, 5, 8, 10, 12, 17, 19, 20, 22)
        assertThat(Solution().maxWalls(robots, distance, walls), equalTo(8))
    }
}
