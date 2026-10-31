package g3801_3900.s3886_sum_of_sortable_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortableIntegers() {
        assertThat<Int>(Solution().sortableIntegers(intArrayOf(3, 1, 2)), equalTo<Int>(3))
    }

    @Test
    fun sortableIntegers2() {
        assertThat<Int>(Solution().sortableIntegers(intArrayOf(7, 6, 5)), equalTo<Int>(0))
    }

    @Test
    fun sortableIntegers3() {
        assertThat<Int>(Solution().sortableIntegers(intArrayOf(5, 8)), equalTo<Int>(3))
    }
}
