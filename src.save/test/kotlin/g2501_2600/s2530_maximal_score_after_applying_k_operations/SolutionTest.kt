package g2501_2600.s2530_maximal_score_after_applying_k_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxKelements() {
        assertThat(Solution().maxKelements(intArrayOf(10, 10, 10, 10, 10), 5), equalTo(50L))
    }

    @Test
    fun maxKelements2() {
        assertThat(Solution().maxKelements(intArrayOf(1, 10, 3, 3, 3), 3), equalTo(17L))
    }
}
