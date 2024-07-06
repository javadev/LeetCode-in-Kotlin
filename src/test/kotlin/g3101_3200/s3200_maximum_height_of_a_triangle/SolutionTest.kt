package g3101_3200.s3200_maximum_height_of_a_triangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxHeightOfTriangle() {
        assertThat(Solution().maxHeightOfTriangle(2, 4), equalTo(3))
    }

    @Test
    fun maxHeightOfTriangle2() {
        assertThat(Solution().maxHeightOfTriangle(2, 1), equalTo(2))
    }
}
