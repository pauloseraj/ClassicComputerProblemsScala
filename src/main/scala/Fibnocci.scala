object Fibnocci {
  /* This is my first java program.
  * This will print 'Hello World' as the output
  */
  def main(args: Array[String]) {
    println(fib(5)) // prints Hello World
  }

  def fib(n: Int): Int ={
    if(n<2){
      return n;
    }
    return fib(n-2) + fib(n-1);
  }
}