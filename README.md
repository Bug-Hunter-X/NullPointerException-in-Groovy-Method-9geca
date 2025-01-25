# Groovy NullPointerException Bug

This repository demonstrates a common error in Groovy: unexpected null handling that leads to a `NullPointerException`.

## Bug Description
The `myMethod` function is intended to add two numbers. However, it does not handle `null` inputs correctly. When one of the parameters is `null`, it returns `null`, which isn't explicitly checked by calling methods, resulting in a potential `NullPointerException` later in the program flow.

## Bug Reproduction
1. Clone this repository.
2. Run `bug.groovy`.
3. Observe the unexpected `null` output.
4. Observe that while this doesn't throw an exception in the current isolated example, in a real world scenario, subsequent use of the null value could throw a `NullPointerException`

## Solution
The solution involves explicitly handling `null` values to prevent the `NullPointerException`.  The improved version of `myMethod` either returns 0 or throws an exception to clearly indicate the invalid input.  Choose the handling that makes sense in your application's context.

## How to run the code
1. Install Groovy: [https://groovy-lang.org/download.html](https://groovy-lang.org/download.html)
2. Run the `bug.groovy` and `bugSolution.groovy` files using the Groovy command-line tool.