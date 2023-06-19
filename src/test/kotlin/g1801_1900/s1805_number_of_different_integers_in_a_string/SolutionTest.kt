package g1801_1900.s1805_number_of_different_integers_in_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numDifferentIntegers() {
        assertThat(Solution().numDifferentIntegers("a123bc34d8ef34"), equalTo(3))
    }

    @Test
    fun numDifferentIntegers2() {
        assertThat(Solution().numDifferentIntegers("leet1234code234"), equalTo(2))
    }

    @Test
    fun numDifferentIntegers3() {
        assertThat(Solution().numDifferentIntegers("a1b01c001"), equalTo(1))
    }
}
