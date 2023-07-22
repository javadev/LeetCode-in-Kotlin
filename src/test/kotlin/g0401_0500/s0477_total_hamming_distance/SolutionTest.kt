package g0401_0500.s0477_total_hamming_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalHammingDistance() {
        assertThat(Solution().totalHammingDistance(intArrayOf(4, 14, 2)), equalTo(6))
    }

    @Test
    fun totalHammingDistance2() {
        assertThat(Solution().totalHammingDistance(intArrayOf(4, 14, 4)), equalTo(4))
    }
}
