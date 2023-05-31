package g1101_1200.s1106_parsing_a_boolean_expression

// #Hard #String #Stack #Recursion #2023_05_31_Time_205_ms_(100.00%)_Space_49.5_MB_(50.00%)

class Solution {
    private var source: String? = null
    private var index = 0

    fun parseBoolExpr(expression: String?): Boolean {
        source = expression
        index = 0
        return expr()
    }

    private fun expr(): Boolean {
        val res: Boolean
        res = if (match('!')) {
            not()
        } else if (match('&')) {
            and()
        } else if (match('|')) {
            or()
        } else {
            bool()
        }
        return res
    }

    private operator fun not(): Boolean {
        consume('!', "Expect '!'")
        return !group()[0]
    }

    private fun or(): Boolean {
        consume('|', "Expect '|'")
        var res = false
        for (e in group()) {
            res = res or e
        }
        return res
    }

    private fun and(): Boolean {
        consume('&', "Expect '&'")
        var res = true
        for (e in group()) {
            res = res and e
        }
        return res
    }

    private fun group(): List<Boolean> {
        consume('(', "Expect '('")
        val res: MutableList<Boolean> = ArrayList()
        while (!match(')')) {
            res.add(expr())
            if (match(',')) {
                advance()
            }
        }
        consume(')', "Expect ')'")
        return res
    }

    private fun bool(): Boolean {
        val isTrue = match('t')
        advance()
        return isTrue
    }

    private val isAtEnd: Boolean
        private get() = index >= source!!.length

    private fun advance() {
        if (isAtEnd) {
            return
        }
        index++
    }

    private fun peek(): Char {
        return source!![index]
    }

    private fun match(ch: Char): Boolean {
        return if (isAtEnd) {
            false
        } else peek() == ch
    }

    private fun consume(ch: Char, message: String) {
        if (!match(ch)) {
            return
        }
        advance()
    }
}
