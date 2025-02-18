package g3401_3500.s3458_select_k_disjoint_special_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubstringLength() {
        assertThat<Boolean>(
            Solution().maxSubstringLength("abcdbaefab", 2),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun maxSubstringLength2() {
        assertThat<Boolean>(
            Solution().maxSubstringLength("cdefdc", 3),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun maxSubstringLength3() {
        assertThat<Boolean>(
            Solution().maxSubstringLength("abeabe", 0),
            equalTo<Boolean>(true),
        )
    }
}
