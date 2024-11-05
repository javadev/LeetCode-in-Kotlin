package g3301_3400.s3340_check_balanced_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isBalanced() {
        assertThat<Boolean?>(Solution().isBalanced("1234"), equalTo<Boolean?>(false))
    }

    @Test
    fun isBalanced2() {
        assertThat<Boolean?>(Solution().isBalanced("24123"), equalTo<Boolean?>(true))
    }
}
