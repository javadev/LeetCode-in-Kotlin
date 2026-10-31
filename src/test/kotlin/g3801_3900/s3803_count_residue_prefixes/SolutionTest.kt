package g3801_3900.s3803_count_residue_prefixes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun residuePrefixes() {
        assertThat<Int>(Solution().residuePrefixes("abc"), equalTo<Int>(2))
    }

    @Test
    fun residuePrefixes2() {
        assertThat<Int>(Solution().residuePrefixes("dd"), equalTo<Int>(1))
    }

    @Test
    fun residuePrefixes3() {
        assertThat<Int>(Solution().residuePrefixes("bob"), equalTo<Int>(2))
    }
}
