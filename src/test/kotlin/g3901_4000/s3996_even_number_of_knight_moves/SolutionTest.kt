package g3901_4000.s3996_even_number_of_knight_moves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canReach() {
        assertThat<Boolean>(
            Solution().canReach(intArrayOf(1, 1), intArrayOf(2, 2)),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun canReach2() {
        assertThat<Boolean>(
            Solution().canReach(intArrayOf(4, 5), intArrayOf(6, 6)),
            equalTo<Boolean>(false),
        )
    }
}
