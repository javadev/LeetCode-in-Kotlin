package g1801_1900.s1808_maximize_number_of_nice_divisors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNiceDivisors() {
        assertThat(Solution().maxNiceDivisors(5), equalTo(6))
    }

    @Test
    fun maxNiceDivisors2() {
        assertThat(Solution().maxNiceDivisors(8), equalTo(18))
    }
}
