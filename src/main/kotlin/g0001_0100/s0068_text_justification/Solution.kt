package g0001_0100.s0068_text_justification

// #Hard #Array #String #Simulation #Top_Interview_150_Array/String
// #2023_07_10_Time_153_ms_(92.96%)_Space_34.1_MB_(100.00%)

class Solution {
    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        // Trying to gauge the number of lines so the ArrayList doesn't need to resize
        val output: MutableList<String> = ArrayList((words.size + 1) / (1 + maxWidth / 7))
        // Setting StringBuilder capacity also
        var sb = StringBuilder(maxWidth)
        var lineTotal = 0
        var numWordsOnLine = 0
        var startWord = 0
        // looping until the 2nd last word, since we're checking words[i + 1] for
        // overflows
        for (i in 0 until words.size - 1) {
            lineTotal += words[i].length
            // tracking line length + #words
            numWordsOnLine++
            // checking if the next word causes an overflow
            if (lineTotal + numWordsOnLine + words[i + 1].length > maxWidth) {
                // if only one word fits on the line...
                if (numWordsOnLine == 1) {
                    // append word
                    sb.append(words[i])
                    // pad right with spaces
                    while (lineTotal++ < maxWidth) {
                        sb.append(' ')
                    }
                } else {
                    // # of extra spaces
                    var extraSp = (maxWidth - lineTotal) % (numWordsOnLine - 1)

                    // Creating the line
                    for (j in startWord until startWord + numWordsOnLine - 1) {
                        // appending the word
                        sb.append(words[j])
                        if (extraSp-- > 0) {
                            // appending an extra space, if required
                            sb.append(' ')
                        }
                        // appending the rest of the required spaces
                        for (k in 0 until (maxWidth - lineTotal) / (numWordsOnLine - 1)) {
                            sb.append(' ')
                        }
                    }
                    // appending the last word of the line
                    sb.append(words[startWord + numWordsOnLine - 1])
                }
                // adding to output list
                output.add(sb.toString())
                // reset everything for next line
                // keeping track of the first word for next line
                startWord = i + 1
                // resetting these to 0 for processing next line
                lineTotal = 0
                numWordsOnLine = lineTotal
                // need a new StringBuilder for the next line
                sb = StringBuilder(maxWidth)
            }
        }
        // handling the final line (no justification, right padded with spaces)
        lineTotal = 0
        for (i in startWord until words.size) {
            lineTotal += words[i].length
            sb.append(words[i])
            if (lineTotal++ < maxWidth) {
                sb.append(' ')
            }
        }
        // padding right side with spaces
        while (lineTotal++ < maxWidth) {
            sb.append(' ')
        }
        // add the final line to output list
        output.add(sb.toString())
        return output
    }
}
