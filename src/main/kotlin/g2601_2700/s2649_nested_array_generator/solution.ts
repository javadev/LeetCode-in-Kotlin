// #Medium #2023_07_19_Time_192_ms_(70.11%)_Space_74.9_MB_(64.70%)

type MultidimensionalArray = (MultidimensionalArray | number)[]

function* inorderTraversal(arr: MultidimensionalArray): Generator<number, void, unknown> {
    if (!Array.isArray(arr)) {
        yield arr
        return
    }

    for (let value of arr) {
        yield* inorderTraversal(value as MultidimensionalArray)
    }
}

/*
 * const gen = inorderTraversal([1, [2, 3]]);
 * gen.next().value; // 1
 * gen.next().value; // 2
 * gen.next().value; // 3
 */

export { inorderTraversal }
