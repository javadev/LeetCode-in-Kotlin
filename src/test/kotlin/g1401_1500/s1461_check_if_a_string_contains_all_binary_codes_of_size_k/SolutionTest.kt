package g1401_1500.s1461_check_if_a_string_contains_all_binary_codes_of_size_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasAllCodes() {
        assertThat(Solution().hasAllCodes("00110110", 2), equalTo(true))
    }

    @Test
    fun hasAllCodes2() {
        assertThat(Solution().hasAllCodes("0110", 1), equalTo(true))
    }

    @Test
    fun hasAllCodes3() {
        assertThat(Solution().hasAllCodes("0110", 2), equalTo(false))
    }
}
