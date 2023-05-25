package g1101_1200.s1175_prime_arrangements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numPrimeArrangements() {
        assertThat(Solution().numPrimeArrangements(5), equalTo(12))
    }

    @Test
    fun numPrimeArrangements2() {
        assertThat(Solution().numPrimeArrangements(100), equalTo(682289015))
    }
}
