package g0701_0800.s0735_asteroid_collision

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun asteroidCollision() {
        assertThat(
            Solution().asteroidCollision(intArrayOf(5, 10, -5)),
            equalTo(intArrayOf(5, 10))
        )
    }

    @Test
    fun asteroidCollision2() {
        assertThat(Solution().asteroidCollision(intArrayOf(8, -8)), equalTo(intArrayOf()))
    }

    @Test
    fun asteroidCollision3() {
        assertThat(
            Solution().asteroidCollision(intArrayOf(10, 2, -5)), equalTo(intArrayOf(10))
        )
    }
}
