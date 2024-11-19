package g2001_2100.s2028_find_missing_observations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun missingRolls() {
        assertThat(
            Solution().missingRolls(intArrayOf(3, 2, 4, 3), 4, 2),
            equalTo(intArrayOf(6, 6)),
        )
    }

    @Test
    fun missingRolls2() {
        assertThat(
            Solution().missingRolls(intArrayOf(1, 5, 6), 3, 4),
            equalTo(intArrayOf(6, 1, 1, 1)),
        )
    }

    @Test
    fun missingRolls3() {
        assertThat(
            Solution().missingRolls(intArrayOf(1, 2, 3, 4), 6, 4),
            equalTo(intArrayOf()),
        )
    }
}
