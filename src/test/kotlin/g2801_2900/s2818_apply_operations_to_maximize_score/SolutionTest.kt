package g2801_2900.s2818_apply_operations_to_maximize_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(
            Solution().maximumScore(mutableListOf<Int?>(8, 3, 9, 3, 8), 2),
            equalTo(81),
        )
    }

    @Test
    fun maximumScore2() {
        assertThat(
            Solution().maximumScore(mutableListOf<Int?>(19, 12, 14, 6, 10, 18), 3),
            equalTo(4788),
        )
    }
}
