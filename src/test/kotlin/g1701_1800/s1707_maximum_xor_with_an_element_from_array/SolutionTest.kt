package g1701_1800.s1707_maximum_xor_with_an_element_from_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeXor() {
        assertThat(
            Solution()
                .maximizeXor(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(3, 1), intArrayOf(1, 3), intArrayOf(5, 6))),
            equalTo(intArrayOf(3, 3, 7))
        )
    }

    @Test
    fun maximizeXor2() {
        assertThat(
            Solution()
                .maximizeXor(
                    intArrayOf(5, 2, 4, 6, 6, 3),
                    arrayOf(
                        intArrayOf(12, 4),
                        intArrayOf(8, 1), intArrayOf(6, 3)
                    )
                ),
            equalTo(intArrayOf(15, -1, 5))
        )
    }
}
