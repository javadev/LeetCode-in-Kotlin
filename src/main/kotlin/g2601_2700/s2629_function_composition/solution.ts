// #Easy #2023_07_17_Time_68_ms_(92.25%)_Space_45.6_MB_(61.28%)

type F = (x: number) => number

function compose(functions: F[]): F {
    const n = functions.length

    return function (x) {
        for (let i = n - 1; i >= 0; i--) {
            const fn = functions[i]
            x = fn(x)
        }

        return x
    }
}

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */

export { compose }
