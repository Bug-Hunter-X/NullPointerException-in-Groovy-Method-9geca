```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    //Option 1: Return a default value
    return 0 
    //Option 2: Throw an exception for better error handling
    //throw new IllegalArgumentException("Null values are not allowed")
  }
  return a + b
}

println myMethod(5, null)
```