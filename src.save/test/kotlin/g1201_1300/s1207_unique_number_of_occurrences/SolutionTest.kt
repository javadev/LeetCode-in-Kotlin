package g1201_1300.s1207_unique_number_of_occurrences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueOccurrences() {
        assertThat(Solution().uniqueOccurrences(intArrayOf(1, 2, 2, 1, 1, 3)), equalTo(true))
    }

    @Test
    fun uniqueOccurrences2() {
        assertThat(Solution().uniqueOccurrences(intArrayOf(1, 2)), equalTo(false))
    }

    @Test
    fun uniqueOccurrences3() {
        assertThat(
            Solution().uniqueOccurrences(intArrayOf(-3, 0, 1, -3, 1, 1, 1, -3, 10, 0)),
            equalTo(true)
        )
    }
}
