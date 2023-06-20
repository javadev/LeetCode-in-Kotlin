package g1801_1900.s1822_sign_of_the_product_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun arraySign() {
        assertThat(Solution().arraySign(intArrayOf(-1, -2, -3, -4, 3, 2, 1)), equalTo(1))
    }

    @Test
    fun arraySign2() {
        assertThat(Solution().arraySign(intArrayOf(1, 5, 0, 2, -3)), equalTo(0))
    }

    @Test
    fun arraySign3() {
        assertThat(Solution().arraySign(intArrayOf(-1, 1, -1, 1, -1)), equalTo(-1))
    }
}
