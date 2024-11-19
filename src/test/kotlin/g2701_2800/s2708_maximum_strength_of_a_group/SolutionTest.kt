package g2701_2800.s2708_maximum_strength_of_a_group

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxStrength() {
        assertThat(
            Solution().maxStrength(intArrayOf(3, -1, -5, 2, 5, -9)),
            equalTo(1350),
        )
    }

    @Test
    fun maxStrength2() {
        assertThat(
            Solution().maxStrength(intArrayOf(-4, -5, -4)),
            equalTo(20),
        )
    }

    @Test
    fun maxStrength3() {
        assertThat(
            Solution().maxStrength(intArrayOf(8, 6, 0, 5, -4, -8, -4, 9, -1, 6, -4, 8, -5)),
            equalTo(265420800),
        )
    }
}
