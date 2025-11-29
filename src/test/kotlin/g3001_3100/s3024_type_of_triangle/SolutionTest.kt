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

    @Test
    fun triangleType3() {
        assertThat(Solution().triangleType(intArrayOf(5, 5, 3)), equalTo("isosceles"))
    }

    @Test
    fun triangleType4() {
        assertThat(Solution().triangleType(intArrayOf(1, 2, 3)), equalTo("none"))
    }

    @Test
    fun triangleType5() {
        assertThat(Solution().triangleType(intArrayOf(100, 100, 100)), equalTo("equilateral"))
    }

    @Test
    fun triangleType6() {
        assertThat(Solution().triangleType(intArrayOf(7, 10, 7)), equalTo("isosceles"))
    }

    @Test
    fun triangleType7() {
        assertThat(Solution().triangleType(intArrayOf(0, 4, 4)), equalTo("none"))
    }

    @Test
    fun triangleType8() {
        assertThat(Solution().triangleType(intArrayOf(-3, 4, 5)), equalTo("none"))
    }

    @Test
    fun triangleType9() {
        // 2 + 3 = 5 → equals, not greater → invalid
        assertThat(Solution().triangleType(intArrayOf(2, 3, 5)), equalTo("none"))
    }

    @Test
    fun triangleType10() {
        assertThat(Solution().triangleType(intArrayOf(5, 3, 4)), equalTo("scalene"))
    }

    @Test
    fun triangleType11() {
        assertThat(Solution().triangleType(intArrayOf(4, 6, 6)), equalTo("isosceles"))
    }

    @Test
    fun triangleType12() {
        assertThat(Solution().triangleType(intArrayOf(0, 0, 0)), equalTo("none"))
    }

    @Test
    fun triangleType13() {
        assertThat(Solution().triangleType(intArrayOf(5, 5, 6)), equalTo("isosceles"))
    }

    @Test
    fun triangleType14() {
        assertThat(Solution().triangleType(intArrayOf(10, 11, 12)), equalTo("scalene"))
    }

    @Test
    fun triangleType15() {
        assertThat(Solution().triangleType(intArrayOf(1, 10, 12)), equalTo("none"))
    }
}
