package g0801_0900.s0878_nth_magical_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthMagicalNumber() {
        assertThat(Solution().nthMagicalNumber(1, 2, 3), equalTo(2))
    }

    @Test
    fun nthMagicalNumber2() {
        assertThat(Solution().nthMagicalNumber(4, 2, 3), equalTo(6))
    }
}
