// #Medium #2023_07_16_Time_107_ms_(88.76%)_Space_62.5_MB_(88.18%)

type MultiDimensionalArray = (number | MultiDimensionalArray)[]

const flat = (arr: MultiDimensionalArray, depth: number): MultiDimensionalArray => {
    const result: MultiDimensionalArray = []

    const flatten = (nestedArray: MultiDimensionalArray, currentDepth: number) => {
        for (const element of nestedArray) {
            if (Array.isArray(element) && currentDepth > 0 && currentDepth <= depth) {
                flatten(element, currentDepth - 1)
            } else {
                result.push(element)
            }
        }
    }

    flatten(arr, depth)
    return result
}

export { flat }
