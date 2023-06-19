package g1801_1900.s1807_evaluate_the_bracket_pairs_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun evaluate() {
        assertThat(
            Solution()
                .evaluate(
                    "(name)is(age)yearsold",
                    listOf(
                        listOf("name", "bob"), listOf("age", "two")
                    )
                ),
            equalTo("bobistwoyearsold")
        )
    }

    @Test
    fun evaluate2() {
        assertThat(
            Solution()
                .evaluate("hi(name)", listOf(listOf("a", "b"))),
            equalTo("hi?")
        )
    }

    @Test
    fun evaluate3() {
        assertThat(
            Solution()
                .evaluate(
                    "(a)(a)(a)aaa",
                    listOf(
                        listOf("a", "yes"), listOf("age", "two")
                    )
                ),
            equalTo("yesyesyesaaa")
        )
    }
}
