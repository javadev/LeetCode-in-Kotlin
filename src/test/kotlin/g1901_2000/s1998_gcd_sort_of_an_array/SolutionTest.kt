package g1901_2000.s1998_gcd_sort_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gcdSort() {
        assertThat(Solution().gcdSort(intArrayOf(7, 21, 3)), equalTo(true))
    }

    @Test
    fun gcdSort2() {
        assertThat(Solution().gcdSort(intArrayOf(5, 2, 6, 2)), equalTo(false))
    }

    @Test
    fun gcdSort3() {
        assertThat(Solution().gcdSort(intArrayOf(10, 5, 9, 3, 15)), equalTo(true))
    }
}
