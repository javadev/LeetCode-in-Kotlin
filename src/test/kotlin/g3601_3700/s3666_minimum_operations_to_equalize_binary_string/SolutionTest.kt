package g3601_3700.s3666_minimum_operations_to_equalize_binary_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Int>(Solution().minOperations("110", 1), equalTo<Int>(1))
    }

    @Test
    fun minOperations2() {
        assertThat<Int>(Solution().minOperations("0101", 3), equalTo<Int>(2))
    }

    @Test
    fun minOperations3() {
        assertThat<Int>(Solution().minOperations("101", 2), equalTo<Int>(-1))
    }

    @Test
    fun minOperations4() {
        val k = 3
        assertThat<Int>(Solution().minOperations("111111", k), equalTo<Int>(0))
    }

    @Test
    fun minOperations5() {
        val k = 6
        assertThat<Int>(Solution().minOperations("000000", k), equalTo<Int>(1))
    }

    @Test
    fun minOperations6() {
        val k = 6
        assertThat<Int>(Solution().minOperations("000111", k), equalTo<Int>(-1))
    }

    @Test
    fun minOperations7() {
        val k = 3
        assertThat<Int>(Solution().minOperations("0011", k), equalTo<Int>(2))
    }

    @Test
    fun minOperations8() {
        val k = 4
        assertThat<Int>(Solution().minOperations("000011", k), equalTo<Int>(1))
    }

    @Test
    fun minOperations9() {
        val k = 2
        assertThat<Int>(Solution().minOperations("000111", k), equalTo<Int>(-1))
    }

    @Test
    fun minOperations10() {
        val k = 4
        assertThat<Int>(Solution().minOperations("001100", k), equalTo<Int>(1))
    }

    @Test
    fun minOperations11() {
        val k = 3
        assertThat<Int>(Solution().minOperations("000100", k), equalTo<Int>(3))
    }

    @Test
    fun minOperations12() {
        val k = 4
        assertThat<Int>(Solution().minOperations("111111", k), equalTo<Int>(0))
    }

    @Test
    fun minOperations13() {
        val k = 4
        assertThat<Int>(Solution().minOperations("001001", k), equalTo<Int>(1))
    }
}
