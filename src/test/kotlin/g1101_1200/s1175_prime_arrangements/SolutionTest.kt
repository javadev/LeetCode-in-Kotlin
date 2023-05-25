package g1101_1200.s1175_prime_arrangements

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numPrimeArrangements() {
        MatcherAssert.assertThat(Solution().numPrimeArrangements(5), CoreMatchers.equalTo(12))
    }

    @Test
    fun numPrimeArrangements2() {
        MatcherAssert.assertThat(Solution().numPrimeArrangements(100), CoreMatchers.equalTo(682289015))
    }
}
