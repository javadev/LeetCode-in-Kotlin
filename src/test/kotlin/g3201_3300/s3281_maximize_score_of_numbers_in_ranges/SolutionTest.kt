package g3201_3300.s3281_maximize_score_of_numbers_in_ranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPossibleScore() {
        assertThat<Int?>(
            Solution().maxPossibleScore(intArrayOf(6, 0, 3), 2),
            equalTo<Int?>(4),
        )
    }

    @Test
    fun maxPossibleScore2() {
        assertThat<Int?>(
            Solution().maxPossibleScore(intArrayOf(2, 6, 13, 13), 5),
            equalTo<Int?>(5),
        )
    }
}
