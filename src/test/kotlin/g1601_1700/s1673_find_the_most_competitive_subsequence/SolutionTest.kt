package g1601_1700.s1673_find_the_most_competitive_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mostCompetitive() {
        assertThat(
            Solution().mostCompetitive(intArrayOf(3, 5, 2, 6), 2),
            equalTo(intArrayOf(2, 6)),
        )
    }

    @Test
    fun mostCompetitive2() {
        assertThat(
            Solution().mostCompetitive(intArrayOf(2, 4, 3, 3, 5, 4, 9, 6), 4),
            equalTo(intArrayOf(2, 3, 3, 4)),
        )
    }
}
