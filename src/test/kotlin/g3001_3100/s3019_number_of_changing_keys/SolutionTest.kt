package g3001_3100.s3019_number_of_changing_keys

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKeyChanges() {
        assertThat(Solution().countKeyChanges("aAbBcC"), equalTo(2))
    }

    @Test
    fun countKeyChanges2() {
        assertThat(Solution().countKeyChanges("AaAaAaaA"), equalTo(0))
    }
}
