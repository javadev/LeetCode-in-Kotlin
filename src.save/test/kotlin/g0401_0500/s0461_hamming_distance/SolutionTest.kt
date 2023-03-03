package g0401_0500.s0461_hamming_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hammingDistance() {
        assertThat(Solution().hammingDistance(1, 4), equalTo(2))
    }

    @Test
    fun hammingDistance2() {
        assertThat(Solution().hammingDistance(3, 1), equalTo(1))
    }
}
