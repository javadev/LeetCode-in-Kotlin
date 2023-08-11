package g1801_1900.s1819_number_of_different_subsequences_gcds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDifferentSubsequenceGCDs() {
        assertThat(
            Solution().countDifferentSubsequenceGCDs(intArrayOf(6, 10, 3)),
            equalTo(5)
        )
    }

    @Test
    fun countDifferentSubsequenceGCDs2() {
        assertThat(
            Solution().countDifferentSubsequenceGCDs(intArrayOf(5, 15, 40, 5, 6)),
            equalTo(7)
        )
    }
}
