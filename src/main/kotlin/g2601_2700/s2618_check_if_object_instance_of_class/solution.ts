// #Medium #2023_07_16_Time_100_ms_(91.86%)_Space_52.3_MB_(63.91%)

function checkIfInstanceOf(obj: any, classFunction: any): boolean {
    if (obj === null || obj === undefined || typeof classFunction !== 'function') return false

    let proto = Object.getPrototypeOf(obj)
    while (proto !== null) {
        if (proto === classFunction.prototype) return true
        proto = Object.getPrototypeOf(proto)
    }
    return false
}

/*
 * checkIfInstanceOf(new Date(), Date); // true
 */

export { checkIfInstanceOf }
