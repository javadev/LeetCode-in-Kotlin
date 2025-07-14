package g3601_3700.s3612_process_string_with_special_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun processStr() {
        assertThat<String>(Solution().processStr("a#b%*"), equalTo<String>("ba"))
    }

    @Test
    fun processStr2() {
        assertThat<String>(Solution().processStr("z*#"), equalTo<String>(""))
    }
}
