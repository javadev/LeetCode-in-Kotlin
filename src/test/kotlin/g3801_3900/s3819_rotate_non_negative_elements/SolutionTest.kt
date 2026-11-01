package g3801_3900.s3819_rotate_non_negative_elements

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotateElements() {
        assertThat<IntArray>(
            Solution().rotateElements(intArrayOf(1, -2, 3, -4), 3),
            equalTo<IntArray>(intArrayOf(3, -2, 1, -4)),
        )
    }

    @Test
    fun rotateElements2() {
        assertThat<IntArray>(
            Solution().rotateElements(intArrayOf(-3, -2, 7), 1),
            equalTo<IntArray>(intArrayOf(-3, -2, 7)),
        )
    }

    @Test
    fun rotateElements3() {
        assertThat<IntArray>(
            Solution().rotateElements(intArrayOf(5, 4, -9, 6), 2),
            equalTo<IntArray>(intArrayOf(6, 5, -9, 4)),
        )
    }
}
