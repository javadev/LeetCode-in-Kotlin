package g3701_3800.s3757_number_of_effective_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countEffective() {
        assertThat<Int>(Solution().countEffective(intArrayOf(1, 2, 3)), equalTo<Int>(3))
    }

    @Test
    fun countEffective2() {
        assertThat<Int>(Solution().countEffective(intArrayOf(7, 4, 6)), equalTo<Int>(4))
    }

    @Test
    fun countEffective3() {
        assertThat<Int>(Solution().countEffective(intArrayOf(8, 8)), equalTo<Int>(1))
    }

    @Test
    fun countEffective4() {
        assertThat<Int>(Solution().countEffective(intArrayOf(2, 2, 1)), equalTo<Int>(5))
    }
}
