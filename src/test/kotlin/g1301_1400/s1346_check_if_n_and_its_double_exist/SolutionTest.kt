package g1301_1400.s1346_check_if_n_and_its_double_exist

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkIfExist() {
        assertThat(Solution().checkIfExist(intArrayOf(10, 2, 5, 3)), equalTo(true))
    }

    @Test
    fun checkIfExist2() {
        assertThat(Solution().checkIfExist(intArrayOf(7, 1, 14, 11)), equalTo(true))
    }

    @Test
    fun checkIfExist3() {
        assertThat(Solution().checkIfExist(intArrayOf(3, 1, 7, 11)), equalTo(false))
    }
}
