// #Medium #2023_07_29_Time_45_ms_(99.58%)_Space_44.6_MB_(72.08%)

type Callback = (...args: any[]) => any
type Subscription = {
    unsubscribe: () => void
}

class EventEmitter {
    subs: Record<string, Callback[]> = {}

    subscribe(eventName: string, callback: Callback): Subscription {
        if (!this.subs[eventName]) this.subs[eventName] = []
        const idx = this.subs[eventName].push(callback) - 1
        return {
            unsubscribe: () => this.subs[eventName].splice(idx, 1),
        }
    }

    emit(eventName: string, args: any[] = []): any[] {
        return this.subs[eventName]?.map((callback) => callback(...args)) || []
    }
}

/*
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */

export { EventEmitter }
