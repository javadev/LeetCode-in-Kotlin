package g2801_2900.s2843_count_symmetric_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSymmetricIntegers() {
        assertThat(Solution().countSymmetricIntegers(1, 100), equalTo(9))
    }

    @Test
    fun countSymmetricIntegers2() {
        assertThat(Solution().countSymmetricIntegers(1200, 1230), equalTo(4))
    }
}
