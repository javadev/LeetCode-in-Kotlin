package g1201_1300.s1286_iterator_for_combination

// #Medium #String #Design #Backtracking #Iterator
class CombinationIterator(characters: String, private val combinationLength: Int) {
    private val list: MutableList<String>
    private var index = 0
    private val visited: BooleanArray

    init {
        list = ArrayList()
        visited = BooleanArray(characters.length)
        buildAllCombinations(characters, 0, StringBuilder(), visited)
    }

    private fun buildAllCombinations(
        characters: String,
        start: Int,
        sb: StringBuilder,
        visited: BooleanArray
    ) {
        if (sb.length == combinationLength) {
            list.add(sb.toString())
        } else {
            var i = start
            while (i < characters.length) {
                if (!visited[i]) {
                    sb.append(characters[i])
                    visited[i] = true
                    buildAllCombinations(characters, i++, sb, visited)
                    visited[i - 1] = false
                    sb.setLength(sb.length - 1)
                } else {
                    i++
                }
            }
        }
    }

    operator fun next(): String {
        return list[index++]
    }

    operator fun hasNext(): Boolean {
        return index < list.size
    }
}
