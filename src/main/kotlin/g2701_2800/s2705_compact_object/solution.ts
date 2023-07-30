// #Medium #2023_07_29_Time_78_ms_(99.38%)_Space_53.4_MB_(71.88%)

type Obj = Record<any, any>

function compactObject(obj: Obj): Obj {
    if (Array.isArray(obj)) {
        let retArr = []
        obj.forEach((e, idx) => {
            if (e) {
                retArr.push(compactObject(e))
            }
        })
        return retArr
    } else if (obj !== null && typeof obj === 'object') {
        let retObj = {}
        for (const key of Object.keys(obj)) {
            if (obj[key]) {
                retObj[key] = compactObject(obj[key])
            }
        }
        return retObj
    }
    return obj
}

export { compactObject }
