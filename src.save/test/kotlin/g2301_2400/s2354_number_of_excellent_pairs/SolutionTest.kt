package g2301_2400.s2354_number_of_excellent_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countExcellentPairs() {
        assertThat(Solution().countExcellentPairs(intArrayOf(1, 2, 3, 1), 3), equalTo(5L))
    }

    @Test
    fun countExcellentPairs2() {
        assertThat(Solution().countExcellentPairs(intArrayOf(5, 1, 1), 10), equalTo(0L))
    }
}
