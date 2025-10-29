package g3701_3800.s3723_maximize_sum_of_squares_of_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumOfSquares() {
        assertThat<String>(Solution().maxSumOfSquares(2, 3), equalTo<String>("30"))
    }

    @Test
    fun maxSumOfSquares2() {
        assertThat<String>(Solution().maxSumOfSquares(2, 17), equalTo<String>("98"))
    }

    @Test
    fun maxSumOfSquares3() {
        assertThat<String>(Solution().maxSumOfSquares(1, 10), equalTo<String>(""))
    }

    @Test
    fun maxSumOfSquares4() {
        // sum = 27 → nines = 3
        // places = 2 < 3 → should return ""
        val result = Solution().maxSumOfSquares(2, 27)
        assertThat<String>(result, equalTo<String>(""))
    }

    @Test
    fun maxSumOfSquares5() {
        // sum = 28 → nines = 3, remSum = 1
        // places = 3 == nines and remSum > 0 → should return ""
        val result = Solution().maxSumOfSquares(3, 28)
        assertThat<String>(result, equalTo<String>(""))
    }

    @Test
    fun maxSumOfSquares6() {
        // sum = 27 → nines = 3, remSum = 0
        // places = 3 == nines and remSum == 0 → should return "999"
        val result = Solution().maxSumOfSquares(3, 27)
        assertThat<String>(result, equalTo<String>("999"))
    }

    @Test
    fun maxSumOfSquares7() {
        // sum = 10 → nines = 1, remSum = 1
        // ans = "9" + "1" = "91", length = 2, places = 2 → no padding
        val result = Solution().maxSumOfSquares(2, 10)
        assertThat<String>(result, equalTo<String>("91"))
    }

    @Test
    fun maxSumOfSquares8() {
        // sum = 10 → nines = 1, remSum = 1
        // ans = "9" + "1" = "91", length = 2, places = 4 → add two zeros
        val result = Solution().maxSumOfSquares(4, 10)
        assertThat<String>(result, equalTo<String>("9100"))
    }

    @Test
    fun maxSumOfSquares9() {
        // sum = 5 → nines = 0, remSum = 5 → ans = "5"
        // places = 3 → add two zeros
        val result = Solution().maxSumOfSquares(3, 5)
        assertThat<String>(result, equalTo<String>("500"))
    }
}
