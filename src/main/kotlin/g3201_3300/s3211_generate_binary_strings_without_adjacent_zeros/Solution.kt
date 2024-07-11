package g3201_3300.s3211_generate_binary_strings_without_adjacent_zeros

// #Medium #String #Bit_Manipulation #Recursion #2024_07_09_Time_1_ms_(100.00%)_Space_46_MB_(27.65%)

class Solution {
    fun validStrings(n: Int): List<String> {
        val strings: MutableList<String> = ArrayList()
        dfs(n, StringBuilder(), strings)
        return strings
    }

    private fun dfs(n: Int, build: StringBuilder, strings: MutableList<String>) {
        if (build.length == n) {
            strings.add(build.toString())
            return
        }
        // need to add a one
        if (build.isNotEmpty() && build[build.length - 1] == '0') {
            build.append('1')
            dfs(n, build, strings)
            // undo for backtracking
            build.setLength(build.length - 1)
            return
        }
        // choose to append a one
        build.append('1')
        dfs(n, build, strings)
        build.setLength(build.length - 1)
        // choose to append a zero
        build.append('0')
        dfs(n, build, strings)
        build.setLength(build.length - 1)
    }
}
