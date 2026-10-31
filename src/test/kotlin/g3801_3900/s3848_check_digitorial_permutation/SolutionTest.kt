package g3801_3900.s3848_check_digitorial_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isDigitorialPermutation() {
        assertThat<Boolean>(
            Solution().isDigitorialPermutation(145),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isDigitorialPermutation2() {
        assertThat<Boolean>(
            Solution().isDigitorialPermutation(10),
            equalTo<Boolean>(false),
        )
    }
}
