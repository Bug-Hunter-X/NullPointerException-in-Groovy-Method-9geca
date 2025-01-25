```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null  //This is where the bug lies
  }
  return a + b
}

println myMethod(5, null)
```