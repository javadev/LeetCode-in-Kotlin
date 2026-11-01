package g3801_3900.s3898_find_the_degree_of_each_vertex

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDegrees() {
        assertThat<IntArray>(
            Solution().findDegrees(arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 0))),
            equalTo<IntArray>(intArrayOf(2, 2, 2)),
        )
    }

    @Test
    fun findDegrees2() {
        assertThat<IntArray>(
            Solution().findDegrees(arrayOf<IntArray>(intArrayOf(0, 1, 0), intArrayOf(1, 0, 0), intArrayOf(0, 0, 0))),
            equalTo<IntArray>(intArrayOf(1, 1, 0)),
        )
    }

    @Test
    fun findDegrees3() {
        assertThat<IntArray>(
            Solution().findDegrees(arrayOf<IntArray>(intArrayOf(0))),
            equalTo<IntArray>(intArrayOf(0)),
        )
    }
}
