package g3701_3800.s3782_last_remaining_integer_after_alternating_deletion_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastInteger() {
        assertThat<Long>(Solution().lastInteger(8L), equalTo<Long>(3L))
    }

    @Test
    fun lastInteger2() {
        assertThat<Long>(Solution().lastInteger(5L), equalTo<Long>(1L))
    }

    @Test
    fun lastInteger3() {
        assertThat<Long>(Solution().lastInteger(1L), equalTo<Long>(1L))
    }
}
