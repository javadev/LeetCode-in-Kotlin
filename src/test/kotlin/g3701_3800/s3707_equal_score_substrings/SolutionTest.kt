package g3701_3800.s3707_equal_score_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreBalance() {
        assertThat<Boolean>(Solution().scoreBalance("adcb"), equalTo<Boolean>(true))
    }

    @Test
    fun scoreBalance2() {
        assertThat<Boolean>(Solution().scoreBalance("bace"), equalTo<Boolean>(false))
    }
}
