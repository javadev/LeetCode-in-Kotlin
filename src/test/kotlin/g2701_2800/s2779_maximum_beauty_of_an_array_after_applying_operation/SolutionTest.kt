package g2701_2800.s2779_maximum_beauty_of_an_array_after_applying_operation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBeauty() {
        assertThat(Solution().maximumBeauty(intArrayOf(4, 6, 1, 2), 2), equalTo(3))
    }

    @Test
    fun maximumBeauty2() {
        assertThat(Solution().maximumBeauty(intArrayOf(1, 1, 1, 1), 10), equalTo(4))
    }
}
