package g3001_3100.s3082_find_the_sum_of_the_power_of_all_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfPower() {
        assertThat(Solution().sumOfPower(intArrayOf(2, 3, 3), 5), equalTo(4))
    }

    @Test
    fun sumOfPower2() {
        assertThat(Solution().sumOfPower(intArrayOf(1, 2, 3), 7), equalTo(0))
    }
}
