package g3801_3900.s3821_find_nth_smallest_integer_with_k_one_bits

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nthSmallest() {
        assertThat<Long>(Solution().nthSmallest(4, 2), equalTo<Long>(9L))
    }

    @Test
    fun nthSmallest2() {
        assertThat<Long>(Solution().nthSmallest(3, 1), equalTo<Long>(4L))
    }
}
