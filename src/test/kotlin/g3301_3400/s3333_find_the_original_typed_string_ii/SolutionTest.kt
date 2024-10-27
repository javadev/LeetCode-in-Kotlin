package g3301_3400.s3333_find_the_original_typed_string_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun possibleStringCount() {
        assertThat<Int?>(Solution().possibleStringCount("aabbccdd", 7), equalTo<Int?>(5))
    }

    @Test
    fun possibleStringCount2() {
        assertThat<Int?>(Solution().possibleStringCount("aabbccdd", 8), equalTo<Int?>(1))
    }

    @Test
    fun possibleStringCount3() {
        assertThat<Int?>(Solution().possibleStringCount("aaabbb", 3), equalTo<Int?>(8))
    }
}
