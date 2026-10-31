package g3701_3800.s3747_count_distinct_integers_after_removing_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDistinct() {
        assertThat<Long>(Solution().countDistinct(9L), equalTo<Long>(9L))
    }

    @Test
    fun countDistinct2() {
        assertThat<Long>(Solution().countDistinct(20L), equalTo<Long>(18L))
    }

    @Test
    fun countDistinct3() {
        assertThat<Long>(Solution().countDistinct(99L), equalTo<Long>(90L))
    }
}
