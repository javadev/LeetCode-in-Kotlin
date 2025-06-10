package g3501_3600.s3577_count_the_number_of_computer_unlocking_permutations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPermutations() {
        assertThat<Int>(Solution().countPermutations(intArrayOf(1, 2, 3)), equalTo<Int>(2))
    }

    @Test
    fun countPermutations2() {
        assertThat<Int>(
            Solution().countPermutations(intArrayOf(3, 3, 3, 4, 4, 4)),
            equalTo<Int>(0),
        )
    }
}
