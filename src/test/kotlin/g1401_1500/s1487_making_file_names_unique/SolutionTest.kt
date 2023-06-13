package g1401_1500.s1487_making_file_names_unique

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val folderNames: Unit
        get() {
            assertThat(
                Solution().getFolderNames(arrayOf("pes", "fifa", "gta", "pes(2019)")),
                equalTo(arrayOf("pes", "fifa", "gta", "pes(2019)"))
            )
        }

    @get:Test
    val folderNames2: Unit
        get() {
            assertThat(
                Solution().getFolderNames(arrayOf("gta", "gta(1)", "gta", "avalon")),
                equalTo(arrayOf("gta", "gta(1)", "gta(2)", "avalon"))
            )
        }

    @get:Test
    val folderNames3: Unit
        get() {
            assertThat(
                Solution()
                    .getFolderNames(
                        arrayOf(
                            "onepiece",
                            "onepiece(1)",
                            "onepiece(2)",
                            "onepiece(3)",
                            "onepiece"
                        )
                    ),
                equalTo(
                    arrayOf(
                        "onepiece", "onepiece(1)", "onepiece(2)", "onepiece(3)", "onepiece(4)"
                    )
                )
            )
        }
}
