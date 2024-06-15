package g3101_3200.s3179_find_the_n_th_value_after_k_seconds

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun valueAfterKSeconds() {
        assertThat(Solution().valueAfterKSeconds(4, 5), equalTo(56))
    }

    @Test
    fun valueAfterKSeconds2() {
        assertThat(Solution().valueAfterKSeconds(5, 3), equalTo(35))
    }
}
