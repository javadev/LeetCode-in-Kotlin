// #Medium #2023_07_17_Time_131_ms_(95.95%)_Space_64.6_MB_(59.54%)

declare global {
    interface Array<T> {
        groupBy(fn: (item: T) => string): Record<string, T[]>
    }
}

Array.prototype.groupBy = function <T>(fn: (item: T) => string) { //NOSONAR
    const returnObject: Record<string, T[]> = {}
    for (const item of this) {
        const key = fn(item)
        if (key in returnObject) {
            returnObject[key].push(item)
        } else {
            returnObject[key] = [item]
        }
    }
    return returnObject
}

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */

export {}
