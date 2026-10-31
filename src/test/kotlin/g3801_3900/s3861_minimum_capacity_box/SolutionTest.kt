package g3801_3900.s3861_minimum_capacity_box

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumIndex() {
        assertThat<Int>(
            Solution().minimumIndex(intArrayOf(1, 5, 3, 7), 3),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minimumIndex2() {
        assertThat<Int>(
            Solution().minimumIndex(intArrayOf(3, 5, 4, 3), 2),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minimumIndex3() {
        assertThat<Int>(Solution().minimumIndex(intArrayOf(4), 5), equalTo<Int>(-1))
    }
}
