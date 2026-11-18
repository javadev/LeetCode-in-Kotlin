package g3901_4000.s3998_transform_binary_string_using_subsequence_sort

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun transformStr() {
        assertThat<BooleanArray>(
            Solution().transformStr("101", arrayOf<String>("1?1", "0?1", "0?0")),
            equalTo<BooleanArray>(booleanArrayOf(true, true, false)),
        )
    }

    @Test
    fun transformStr2() {
        assertThat<BooleanArray>(
            Solution().transformStr("1100", arrayOf<String>("0011", "11?1", "1?1?")),
            equalTo<BooleanArray>(booleanArrayOf(true, false, true)),
        )
    }

    @Test
    fun transformStr3() {
        assertThat<BooleanArray>(
            Solution().transformStr("1010", arrayOf<String>("0011")),
            equalTo<BooleanArray>(booleanArrayOf(true)),
        )
    }
}
