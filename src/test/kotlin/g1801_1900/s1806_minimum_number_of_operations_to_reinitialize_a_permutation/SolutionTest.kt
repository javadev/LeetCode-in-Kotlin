package g1801_1900.s1806_minimum_number_of_operations_to_reinitialize_a_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reinitializePermutation() {
        assertThat(Solution().reinitializePermutation(2), equalTo(1))
    }

    @Test
    fun reinitializePermutation2() {
        assertThat(Solution().reinitializePermutation(4), equalTo(2))
    }
}
