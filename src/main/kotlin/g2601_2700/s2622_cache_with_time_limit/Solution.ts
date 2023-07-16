// #Medium #2023_07_16_Time_59_ms_(86.77%)_Space_42.4_MB_(94.28%)

class TimeLimitedCache {
    private keyMap:Map<number,any>;
    constructor() {
        this.keyMap = new Map<number,any>();
    }

    set(key: number, value: number, duration: number): boolean {
        let existed:boolean = this.keyMap.has(key);
        if(existed) clearTimeout(this.keyMap.get(key).clearRef);

        this.keyMap.set(key,{
            value,
            clearRef:setTimeout(()=>{
                this.keyMap.delete(key);
            },duration)
        });
        return existed;
    }

    get(key: number): number {
        return this.keyMap.has(key) ? this.keyMap.get(key).value : -1;
    }

	count(): number {
        return this.keyMap.size;
    }
}


/**
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1
 */