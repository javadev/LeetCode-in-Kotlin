package g1401_1500.s1416_restore_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfArrays() {
        assertThat(Solution().numberOfArrays("1000", 10000), equalTo(1))
    }

    @Test
    fun numberOfArrays2() {
        assertThat(Solution().numberOfArrays("1000", 10), equalTo(0))
    }

    @Test
    fun numberOfArrays3() {
        assertThat(Solution().numberOfArrays("1317", 2000), equalTo(8))
    }
}
