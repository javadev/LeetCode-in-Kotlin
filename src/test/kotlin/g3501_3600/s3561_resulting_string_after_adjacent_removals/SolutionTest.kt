package g3501_3600.s3561_resulting_string_after_adjacent_removals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun resultingString() {
        assertThat<String>(Solution().resultingString("abc"), equalTo<String>("c"))
    }

    @Test
    fun resultingString2() {
        assertThat<String>(Solution().resultingString("adcb"), equalTo<String>(""))
    }

    @Test
    fun resultingString3() {
        assertThat<String>(Solution().resultingString("zadb"), equalTo<String>("db"))
    }
}
