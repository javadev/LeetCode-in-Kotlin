package g1201_1300.s1223_dice_roll_simulation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun dieSimulator() {
        assertThat(Solution().dieSimulator(2, intArrayOf(1, 1, 2, 2, 2, 3)), equalTo(34))
    }

    @Test
    fun dieSimulator2() {
        assertThat(Solution().dieSimulator(2, intArrayOf(1, 1, 1, 1, 1, 1)), equalTo(30))
    }

    @Test
    fun dieSimulator3() {
        assertThat(Solution().dieSimulator(3, intArrayOf(1, 1, 1, 2, 2, 3)), equalTo(181))
    }
}
