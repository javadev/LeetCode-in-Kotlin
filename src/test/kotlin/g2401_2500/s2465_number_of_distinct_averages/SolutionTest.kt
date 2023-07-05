package g2401_2500.s2465_number_of_distinct_averages

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctAverages() {
        assertThat(Solution().distinctAverages(intArrayOf(4, 1, 4, 0, 3, 5)), equalTo(2))
    }

    @Test
    fun distinctAverages2() {
        assertThat(Solution().distinctAverages(intArrayOf(1, 100)), equalTo(1))
    }
}
