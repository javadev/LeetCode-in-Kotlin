package g2901_3000.s2951_find_the_peaks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPeaks() {
        assertThat(Solution().findPeaks(intArrayOf(2, 4, 4)), equalTo(listOf<Any>()))
    }

    @Test
    fun findPeaks2() {
        assertThat(Solution().findPeaks(intArrayOf(1, 4, 3, 8, 5)), equalTo(listOf(1, 3)))
    }
}
