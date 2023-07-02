package g1401_1500.s1441_build_an_array_with_stack_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buildArray() {
        assertThat(
            Solution().buildArray(intArrayOf(1, 3), 3),
            equalTo(mutableListOf("Push", "Push", "Pop", "Push"))
        )
    }

    @Test
    fun buildArray2() {
        assertThat(
            Solution().buildArray(intArrayOf(1, 2, 3), 3),
            equalTo(mutableListOf("Push", "Push", "Push"))
        )
    }

    @Test
    fun buildArray3() {
        assertThat(
            Solution().buildArray(intArrayOf(1, 2), 4),
            equalTo(mutableListOf("Push", "Push"))
        )
    }
}
