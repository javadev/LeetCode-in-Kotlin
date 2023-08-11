package g2701_2800.s2769_find_the_maximum_achievable_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun theMaximumAchievableX() {
        assertThat(Solution().theMaximumAchievableX(4, 1), equalTo(6))
    }

    @Test
    fun theMaximumAchievableX2() {
        assertThat(Solution().theMaximumAchievableX(3, 2), equalTo(7))
    }
}
