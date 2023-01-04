package g0401_0500.s0493_reverse_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reversePairs() {
        assertThat(Solution().reversePairs(intArrayOf(1, 3, 2, 3, 1)), equalTo(2))
    }

    @Test
    fun reversePairs2() {
        assertThat(Solution().reversePairs(intArrayOf(2, 4, 3, 5, 1)), equalTo(3))
    }
}
