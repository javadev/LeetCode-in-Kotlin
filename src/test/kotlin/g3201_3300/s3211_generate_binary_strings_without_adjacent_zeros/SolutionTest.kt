package g3201_3300.s3211_generate_binary_strings_without_adjacent_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validStrings() {
        assertThat(
            Solution().validStrings(3),
            equalTo(listOf("111", "110", "101", "011", "010"))
        )
    }

    @Test
    fun validStrings2() {
        assertThat(Solution().validStrings(1), equalTo(listOf("1", "0")))
    }
}
