package g3601_3700.s3614_process_string_with_special_operations_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun processStr() {
        assertThat<Char>(Solution().processStr("a#b%*", 1), equalTo<Char>('a'))
    }

    @Test
    fun processStr2() {
        assertThat<Char>(Solution().processStr("cd%#*#", 3), equalTo<Char>('d'))
    }

    @Test
    fun processStr3() {
        assertThat<Char>(Solution().processStr("z*#", 0), equalTo<Char>('.'))
    }
}
