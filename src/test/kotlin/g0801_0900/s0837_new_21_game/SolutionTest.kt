package g0801_0900.s0837_new_21_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.roundToInt

internal class SolutionTest {
    var n = 100000

    @Test
    fun new21Game() {
        assertThat(
            (Solution().new21Game(10, 1, 10) * n).roundToInt().toDouble() / n, equalTo(1.00000)
        )
    }

    @Test
    fun new21Game2() {
        assertThat((Solution().new21Game(6, 1, 10) * n).roundToInt().toDouble() / n, equalTo(0.6))
    }

    @Test
    fun new21Game3() {
        assertThat(
            (Solution().new21Game(21, 17, 10) * n).roundToInt().toDouble() / n,
            equalTo(0.73278)
        )
    }
}
