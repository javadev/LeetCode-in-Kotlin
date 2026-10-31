package g3701_3800.s3797_count_routes_to_climb_a_rectangular_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfRoutes() {
        assertThat<Int>(
            Solution().numberOfRoutes(arrayOf<String>("..", "#."), 1),
            equalTo<Int>(2),
        )
    }

    @Test
    fun numberOfRoutes2() {
        assertThat<Int>(
            Solution().numberOfRoutes(arrayOf<String>("..", "#."), 2),
            equalTo<Int>(4),
        )
    }

    @Test
    fun numberOfRoutes3() {
        assertThat<Int>(
            Solution().numberOfRoutes(arrayOf<String>("#"), 750),
            equalTo<Int>(0),
        )
    }

    @Test
    fun numberOfRoutes4() {
        assertThat<Int>(
            Solution().numberOfRoutes(arrayOf<String>(".."), 1),
            equalTo<Int>(4),
        )
    }
}
