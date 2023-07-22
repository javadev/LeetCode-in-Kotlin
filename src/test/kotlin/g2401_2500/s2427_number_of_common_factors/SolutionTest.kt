package g2401_2500.s2427_number_of_common_factors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun commonFactors() {
        assertThat(Solution().commonFactors(12, 6), equalTo(4))
    }

    @Test
    fun commonFactors2() {
        assertThat(Solution().commonFactors(25, 30), equalTo(2))
    }
}
