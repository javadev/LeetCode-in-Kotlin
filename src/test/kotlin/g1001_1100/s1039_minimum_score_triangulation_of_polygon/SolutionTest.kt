package g1001_1100.s1039_minimum_score_triangulation_of_polygon

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minScoreTriangulation() {
        assertThat(Solution().minScoreTriangulation(intArrayOf(1, 2, 3)), equalTo(6))
    }

    @Test
    fun minScoreTriangulation2() {
        assertThat(Solution().minScoreTriangulation(intArrayOf(3, 7, 4, 5)), equalTo(144))
    }

    @Test
    fun minScoreTriangulation3() {
        assertThat(Solution().minScoreTriangulation(intArrayOf(1, 3, 1, 4, 1, 5)), equalTo(13))
    }
}
