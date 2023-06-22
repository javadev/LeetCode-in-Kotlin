package g1801_1900.s1849_splitting_a_string_into_descending_consecutive_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitString() {
        assertThat(Solution().splitString("1234"), equalTo(false))
    }

    @Test
    fun splitString2() {
        assertThat(Solution().splitString("050043"), equalTo(true))
    }

    @Test
    fun splitString3() {
        assertThat(Solution().splitString("9080701"), equalTo(false))
    }
}
