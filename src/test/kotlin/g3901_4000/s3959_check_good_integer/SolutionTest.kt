package g3901_4000.s3959_check_good_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkGoodInteger() {
        assertThat<Boolean>(Solution().checkGoodInteger(1000), equalTo<Boolean>(false))
    }

    @Test
    fun checkGoodInteger2() {
        assertThat<Boolean>(Solution().checkGoodInteger(19), equalTo<Boolean>(true))
    }

    @Test
    fun checkGoodInteger3() {
        assertThat<Boolean>(Solution().checkGoodInteger(99), equalTo<Boolean>(true))
    }
}
