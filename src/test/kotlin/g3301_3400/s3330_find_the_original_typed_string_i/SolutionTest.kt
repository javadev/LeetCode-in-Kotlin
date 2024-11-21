package g3301_3400.s3330_find_the_original_typed_string_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun possibleStringCount() {
        assertThat<Int>(Solution().possibleStringCount("abbcccc"), equalTo<Int>(5))
    }

    @Test
    fun possibleStringCount2() {
        assertThat<Int>(Solution().possibleStringCount("abcd"), equalTo<Int>(1))
    }

    @Test
    fun possibleStringCount3() {
        assertThat<Int>(Solution().possibleStringCount("aaaa"), equalTo<Int>(4))
    }
}
