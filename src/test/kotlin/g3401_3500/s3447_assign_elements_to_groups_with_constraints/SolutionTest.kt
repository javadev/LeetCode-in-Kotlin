package g3401_3500.s3447_assign_elements_to_groups_with_constraints

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun assignElements() {
        assertThat<IntArray>(
            Solution().assignElements(intArrayOf(8, 4, 3, 2, 4), intArrayOf(4, 2)),
            equalTo<IntArray>(intArrayOf(0, 0, -1, 1, 0)),
        )
    }

    @Test
    fun assignElements2() {
        assertThat<IntArray>(
            Solution().assignElements(intArrayOf(2, 3, 5, 7), intArrayOf(5, 3, 3)),
            equalTo<IntArray>(intArrayOf(-1, 1, 0, -1)),
        )
    }

    @Test
    fun assignElements3() {
        assertThat<IntArray>(
            Solution().assignElements(intArrayOf(10, 21, 30, 41), intArrayOf(2, 1)),
            equalTo<IntArray>(intArrayOf(0, 1, 0, 1)),
        )
    }
}
