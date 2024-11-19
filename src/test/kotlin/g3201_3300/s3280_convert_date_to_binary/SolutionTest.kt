package g3201_3300.s3280_convert_date_to_binary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertDateToBinary() {
        assertThat<String?>(
            Solution().convertDateToBinary("2080-02-29"),
            equalTo<String?>("100000100000-10-11101"),
        )
    }

    @Test
    fun convertDateToBinary2() {
        assertThat<String?>(
            Solution().convertDateToBinary("1900-01-01"),
            equalTo<String?>("11101101100-1-1"),
        )
    }
}
