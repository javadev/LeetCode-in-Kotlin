package g3801_3900.s3843_first_element_with_unique_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun firstUniqueFreq() {
        assertThat<Int>(
            Solution().firstUniqueFreq(intArrayOf(20, 10, 30, 30)),
            equalTo<Int>(30),
        )
    }

    @Test
    fun firstUniqueFreq2() {
        assertThat<Int>(
            Solution().firstUniqueFreq(intArrayOf(20, 20, 10, 30, 30, 30)),
            equalTo<Int>(20),
        )
    }

    @Test
    fun firstUniqueFreq3() {
        assertThat<Int>(
            Solution().firstUniqueFreq(intArrayOf(10, 10, 20, 20)),
            equalTo<Int>(-1),
        )
    }
}
