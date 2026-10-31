package g3701_3800.s3791_number_of_balanced_integers_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countBalanced() {
        assertThat<Long>(Solution().countBalanced(1, 100), equalTo<Long>(9L))
    }

    @Test
    fun countBalanced2() {
        assertThat<Long>(Solution().countBalanced(120, 129), equalTo<Long>(1L))
    }

    @Test
    fun countBalanced3() {
        assertThat<Long>(Solution().countBalanced(1234, 1234), equalTo<Long>(0L))
    }
}
