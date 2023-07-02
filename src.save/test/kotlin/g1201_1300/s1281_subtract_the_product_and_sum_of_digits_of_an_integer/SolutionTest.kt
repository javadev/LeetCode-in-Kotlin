package g1201_1300.s1281_subtract_the_product_and_sum_of_digits_of_an_integer

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subtractProductAndSum() {
        assertThat(Solution().subtractProductAndSum(234), equalTo(15))
    }

    @Test
    fun subtractProductAndSum2() {
        assertThat(Solution().subtractProductAndSum(4421), equalTo(21))
    }
}
