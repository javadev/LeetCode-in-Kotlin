package g0901_1000.s0903_valid_permutations_for_di_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numPermsDISequence() {
        assertThat(Solution().numPermsDISequence("DID"), equalTo(5))
    }

    @Test
    fun numPermsDISequence2() {
        assertThat(Solution().numPermsDISequence("D"), equalTo(1))
    }
}
