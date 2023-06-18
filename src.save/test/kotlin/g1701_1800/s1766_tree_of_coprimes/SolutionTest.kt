package g1701_1800.s1766_tree_of_coprimes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun coprimes() {
        assertThat(
            Solution()
                .getCoprimes(intArrayOf(2, 3, 3, 2), arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3))),
            equalTo(intArrayOf(-1, 0, 0, 1))
        )
    }

    @Test
    fun coprimes2() {
        assertThat(
            Solution()
                .getCoprimes(
                    intArrayOf(5, 6, 10, 2, 3, 6, 15),
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(1, 4), intArrayOf(2, 5),
                        intArrayOf(2, 6)
                    )
                ),
            equalTo(intArrayOf(-1, 0, -1, 0, 0, 0, -1))
        )
    }
}
