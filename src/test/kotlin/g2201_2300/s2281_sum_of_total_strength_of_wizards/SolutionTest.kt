package g2201_2300.s2281_sum_of_total_strength_of_wizards

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalStrength() {
        assertThat(Solution().totalStrength(intArrayOf(1, 3, 1, 2)), equalTo(44))
    }

    @Test
    fun totalStrength2() {
        assertThat(Solution().totalStrength(intArrayOf(5, 4, 6)), equalTo(213))
    }
}
