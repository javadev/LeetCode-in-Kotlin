package g3901_4000.s3984_divisible_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divisibleGame() {
        assertThat<Int>(Solution().divisibleGame(intArrayOf(1, 4, 6, 8)), equalTo<Int>(36))
    }

    @Test
    fun divisibleGame2() {
        assertThat<Int>(Solution().divisibleGame(intArrayOf(2, 1, 2)), equalTo<Int>(6))
    }

    @Test
    fun divisibleGame3() {
        assertThat<Int>(Solution().divisibleGame(intArrayOf(1)), equalTo<Int>(1000000005))
    }
}
