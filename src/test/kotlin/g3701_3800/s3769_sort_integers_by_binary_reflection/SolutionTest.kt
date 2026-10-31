package g3701_3800.s3769_sort_integers_by_binary_reflection

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortByReflection() {
        val result = Solution().sortByReflection(intArrayOf(1, 2, 3))
        assertThat<Int>(result[0], equalTo<Int>(1))
        assertThat<Int>(result[1], equalTo<Int>(2))
        assertThat<Int>(result[2], equalTo<Int>(3))
    }

    @Test
    fun sortByReflection2() {
        val result = Solution().sortByReflection(intArrayOf(0, 1, 2))
        assertThat<Int>(result[0], equalTo<Int>(0))
        assertThat<Int>(result[1], equalTo<Int>(1))
        assertThat<Int>(result[2], equalTo<Int>(2))
    }

    @Test
    fun sortByReflection3() {
        val result = Solution().sortByReflection(intArrayOf(6, 9))
        assertThat<Int>(result[0], equalTo<Int>(6))
        assertThat<Int>(result[1], equalTo<Int>(9))
    }
}
