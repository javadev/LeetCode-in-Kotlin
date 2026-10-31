package g3801_3900.s3869_count_fancy_numbers_in_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countFancy() {
        assertThat<Long>(Solution().countFancy(8, 10), equalTo<Long>(3L))
    }

    @Test
    fun countFancy2() {
        assertThat<Long>(Solution().countFancy(12340, 12341), equalTo<Long>(1L))
    }

    @Test
    fun countFancy3() {
        assertThat<Long>(Solution().countFancy(123456788, 123456788), equalTo<Long>(0L))
    }
}
