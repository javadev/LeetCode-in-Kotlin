package g1201_1300.s1207_unique_number_of_occurrences

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueOccurrences() {
        MatcherAssert.assertThat(Solution().uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)), CoreMatchers.equalTo(true))
    }

    @Test
    fun uniqueOccurrences2() {
        MatcherAssert.assertThat(Solution().uniqueOccurrences(intArrayOf(1, 2)), CoreMatchers.equalTo(false))
    }

    @Test
    fun uniqueOccurrences3() {
        MatcherAssert.assertThat(
            Solution().uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)),
            CoreMatchers.equalTo(true)
        )
    }
}
