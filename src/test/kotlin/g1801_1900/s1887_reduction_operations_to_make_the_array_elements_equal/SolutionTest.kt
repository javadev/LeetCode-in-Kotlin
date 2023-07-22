package g1801_1900.s1887_reduction_operations_to_make_the_array_elements_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reductionOperations() {
        assertThat(Solution().reductionOperations(intArrayOf(5, 1, 3)), equalTo(3))
    }

    @Test
    fun reductionOperations2() {
        assertThat(Solution().reductionOperations(intArrayOf(1, 1, 1)), equalTo(0))
    }

    @Test
    fun reductionOperations3() {
        assertThat(Solution().reductionOperations(intArrayOf(1, 1, 2, 2, 3)), equalTo(4))
    }
}
