package g2401_2500.s2420_find_all_good_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodIndices() {
        assertThat(
            Solution().goodIndices(intArrayOf(2, 1, 1, 1, 3, 4, 1), 2),
            equalTo(listOf(2, 3)),
        )
    }

    @Test
    fun goodIndices2() {
        assertThat(
            Solution().goodIndices(intArrayOf(2, 1, 1, 2), 2),
            equalTo(emptyList<Any>()),
        )
    }

    @Test
    fun goodIndices3() {
        assertThat(
            Solution().goodIndices(intArrayOf(5, 3, 4, 2, 1), 1),
            equalTo(listOf(1, 2, 3)),
        )
    }

    @Test
    fun goodIndices4() {
        assertThat(
            Solution().goodIndices(intArrayOf(5, 4, 3, 2, 1), 2),
            equalTo(emptyList<Int>()),
        )
    }

    @Test
    fun goodIndices5() {
        assertThat(
            Solution().goodIndices(intArrayOf(1, 2, 3, 4, 5), 2),
            equalTo(emptyList<Int>()),
        )
    }

    @Test
    fun goodIndices6() {
        assertThat(
            Solution().goodIndices(intArrayOf(1, 2), 2),
            equalTo(emptyList<Int>()),
        )
    }

    @Test
    fun goodIndices7() {
        assertThat(
            Solution().goodIndices(intArrayOf(5, 4, 4, 3, 2, 2, 3, 4, 4, 3, 2), 2),
            equalTo(listOf(3, 4, 5, 6)),
        )
    }

    @Test
    fun goodIndices8() {
        assertThat(
            Solution().goodIndices(intArrayOf(3, 2, 1, 2, 3, 2, 1, 2, 3), 2),
            equalTo(listOf(2, 6)),
        )
    }

    @Test
    fun goodIndices9() {
        assertThat(
            Solution().goodIndices(intArrayOf(3, 2, 1, 1, 2, 3), 2),
            equalTo(listOf(2, 3)),
        )
    }

    @Test
    fun goodIndices10() {
        assertThat(
            Solution().goodIndices(intArrayOf(2, 2, 2, 2, 2), 2),
            equalTo(listOf(2)),
        )
    }
}
