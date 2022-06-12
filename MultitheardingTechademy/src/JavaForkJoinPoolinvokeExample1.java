//Assignment 1

/*
 "Write a java program which accepts multiple employees details ,

1)Create thread class

2)Execute them using frokjoinpool

3)make the use of runnable interface in it."

 */

import java.util.Random;  

import java.util.concurrent.ForkJoinPool;  

import java.util.concurrent.RecursiveTask;  

    public class JavaForkJoinPoolinvokeExample1 extends RecursiveTask<Integer> {  
      private static final int var = 5;  
          private final int[] value;  
         private final int st;  
         private final int ed;  
         //parameterized constructor  
   public JavaForkJoinPoolinvokeExample1(int[] value, int st, int ed) {  
    this.value = value;  
    this.st = st;  
    this.ed = ed;  
  }  
   public JavaForkJoinPoolinvokeExample1(int[] value) {  
    this(value, 0, value.length);  
  }  
      @Override  
  protected Integer compute() {  
    final int length = ed - st;  
    if (length < var) {  
      return computeDirectly();  
    }  
    final int split = length / 2;  
        //new class object   
        ForkJoinPool pl = new  ForkJoinPool();  
    JavaForkJoinPoolinvokeExample1 left = new JavaForkJoinPoolinvokeExample1(value, st, st + split);  
    pl.invoke(left.fork());  
         JavaForkJoinPoolinvokeExample1 right = new JavaForkJoinPoolinvokeExample1(value, st + split, ed);  
            return Math.max(right.compute(), left.join());   
  }  
  private Integer computeDirectly() {  
    System.out.println(Thread.currentThread() + " computing: " + st + " to " + ed);  
    int max = Integer.MIN_VALUE;  
    for (int i = st; i < ed; i++) {  
      if (value[i] > max) {  
        max = value[i];  
      }  
    }  
    return max;  
  }  

  public static void main(String[] args) {  
    // create a random data set  
    final int[] value = new int[10];  
    final Random rand = new Random();  
    for (int i = 0; i < value.length; i++) {  
      value[i] = rand.nextInt(100);  
    }  
       // submit the task to the poool  
       ForkJoinPool pool = ForkJoinPool.commonPool();  
       JavaForkJoinPoolinvokeExample1 finder = new JavaForkJoinPoolinvokeExample1(value);  
    System.out.println(pool.invoke(finder));  
      //  pool.invokeAll(t);  
       pool.invoke(finder);  
}  
}

