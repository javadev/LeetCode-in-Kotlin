package g3801_3900.s3827_count_monobit_integers

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMonobit() {
        assertThat<Int>(Solution().countMonobit(1), equalTo<Int>(2))
    }

    @Test
    fun countMonobit2() {
        assertThat<Int>(Solution().countMonobit(4), equalTo<Int>(3))
    }
}
