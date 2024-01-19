package g2901_3000.s2998_minimum_number_of_operations_to_make_x_and_y_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperationsToMakeEqual() {
        assertThat(Solution().minimumOperationsToMakeEqual(26, 1), equalTo(3))
    }

    @Test
    fun minimumOperationsToMakeEqual2() {
        assertThat(Solution().minimumOperationsToMakeEqual(54, 2), equalTo(4))
    }
}
