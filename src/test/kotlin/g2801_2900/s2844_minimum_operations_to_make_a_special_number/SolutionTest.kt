package g2801_2900.s2844_minimum_operations_to_make_a_special_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations("2245047"), equalTo(2))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations("2908305"), equalTo(3))
    }

    @Test
    fun minimumOperations3() {
        assertThat(Solution().minimumOperations("10"), equalTo(1))
    }
}
