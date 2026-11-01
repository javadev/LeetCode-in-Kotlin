package g3801_3900.s3889_mirror_frequency_distance

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mirrorFrequency() {
        assertThat<Int>(Solution().mirrorFrequency("ab1z9"), equalTo<Int>(3))
    }

    @Test
    fun mirrorFrequency2() {
        assertThat<Int>(Solution().mirrorFrequency("4m7n"), equalTo<Int>(2))
    }

    @Test
    fun mirrorFrequency3() {
        assertThat<Int>(Solution().mirrorFrequency("byby"), equalTo<Int>(0))
    }
}
