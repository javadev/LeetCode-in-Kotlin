// tslint:disable:no-magic-numbers
import { createHelloWorld } from 'src/main/kotlin/g2601_2700/s2667_create_hello_world_function/solution'
import { expect, test } from 'vitest'

test('createHelloWorld', () => {
    const counter = createHelloWorld()
    expect(counter()).toEqual('Hello World')
})

test('createHelloWorld', () => {
    const counter = createHelloWorld()
    expect(counter({}, null, 42)).toEqual('Hello World')
})
