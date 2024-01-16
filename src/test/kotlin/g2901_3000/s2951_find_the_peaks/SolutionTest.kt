package g2901_3000.s2951_find_the_peaks

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPeaks() {
        MatcherAssert.assertThat(Solution().findPeaks(intArrayOf(2, 4, 4)), CoreMatchers.equalTo(listOf<Any>()))
    }

    @Test
    fun findPeaks2() {
        MatcherAssert.assertThat(Solution().findPeaks(intArrayOf(1, 4, 3, 8, 5)), CoreMatchers.equalTo(listOf(1, 3)))
    }
}
