package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfPairs() {
        MatcherAssert.assertThat(
            Solution().numOfPairs(arrayOf("777", "7", "77", "77"), "7777"),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun numOfPairs2() {
        MatcherAssert.assertThat(
            Solution().numOfPairs(arrayOf("123", "4", "12", "34"), "1234"),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun numOfPairs3() {
        MatcherAssert.assertThat(Solution().numOfPairs(arrayOf("1", "1", "1"), "11"), CoreMatchers.equalTo(6))
    }
}
