package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfPairs() {
        assertThat(
            Solution().numOfPairs(arrayOf("777", "7", "77", "77"), "7777"),
            equalTo(4)
        )
    }

    @Test
    fun numOfPairs2() {
        assertThat(
            Solution().numOfPairs(arrayOf("123", "4", "12", "34"), "1234"),
            equalTo(2)
        )
    }

    @Test
    fun numOfPairs3() {
        assertThat(Solution().numOfPairs(arrayOf("1", "1", "1"), "11"), equalTo(6))
    }
}
