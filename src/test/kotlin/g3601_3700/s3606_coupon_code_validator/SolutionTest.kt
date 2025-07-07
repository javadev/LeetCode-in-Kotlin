package g3601_3700.s3606_coupon_code_validator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validateCoupons() {
        assertThat<List<String>>(
            Solution()
                .validateCoupons(
                    arrayOf<String>("SAVE20", "", "PHARMA5", "SAVE@20"),
                    arrayOf<String>("restaurant", "grocery", "pharmacy", "restaurant"),
                    booleanArrayOf(true, true, true, true),
                ),
            equalTo<List<String>>(mutableListOf<String>("PHARMA5", "SAVE20")),
        )
    }

    @Test
    fun validateCoupons2() {
        assertThat<List<String>>(
            Solution()
                .validateCoupons(
                    arrayOf<String>("GROCERY15", "ELECTRONICS_50", "DISCOUNT10"),
                    arrayOf<String>("grocery", "electronics", "invalid"),
                    booleanArrayOf(false, true, true),
                ),
            equalTo<List<String>>(mutableListOf<String>("ELECTRONICS_50")),
        )
    }
}
