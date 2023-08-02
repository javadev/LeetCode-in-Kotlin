// #Medium #2023_08_02_Time_280_ms_(98.29%)_Space_99.7_MB_(97.43%)

function join(arr1: any[], arr2: any[]): any[] {
    const result: any = {}
    for(let obj of arr1) {
        result[obj.id] = obj
    }
    for(let obj of arr2) {
        if(result[obj.id]) {
            for(let key in obj) {
                result[obj.id][key] = obj[key]
            }
        } else {
            result[obj.id] = obj
        }
    }
  return Object.values(result)
}

export { join }
