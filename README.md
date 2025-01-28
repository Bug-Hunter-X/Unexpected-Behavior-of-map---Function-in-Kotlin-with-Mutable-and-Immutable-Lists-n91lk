# Unexpected Behavior of map() Function in Kotlin with Mutable and Immutable Lists

This example demonstrates the difference in behavior between using the `map()` function on immutable and mutable lists in Kotlin.  It highlights a potential source of confusion for developers unfamiliar with the nuances of Kotlin's collection APIs.

The `bug.kt` file shows that `map()` on an immutable list does *not* modify the original list, it only returns a new mapped list.  The `bugSolution.kt` file demonstrates that using `map` with a mutable list also generates a new list. 

This behavior is documented but can easily be overlooked, leading to unexpected results.
