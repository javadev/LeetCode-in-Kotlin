package g3001_3100.s3024_type_of_triangle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun triangleType() {
        assertThat(Solution().triangleType(intArrayOf(3, 3, 3)), equalTo("equilateral"))
    }

    @Test
    fun triangleType2() {
        assertThat(Solution().triangleType(intArrayOf(3, 4, 5)), equalTo("scalene"))
    }
}
