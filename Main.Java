// // // // import java.util.ArrayList; // Import ArrayList
// // // // import java.util.List;

// // // // public class Main {
// // // //     public static void main(String args[]) {
// // // //         List<Integer> lis = new ArrayList<>(); // Create an ArrayList
// // // //         lis.add(10); // Add elements
// // // //         lis.add(12);

// // // //         // Get the first element (for demonstration)
// // // //         System.out.println("First element: " + lis.get(0)); // Prints: 10

// // // //         // You can remove an element if needed, for example, removing the element at index 1:
// // // //         // lis.remove(1); // Uncomment to remove element at index 1

// // // //         // Print the size of the list
// // // //         System.out.println("Size of the list: " + lis.size()); // Prints the size of the list

// // // //         // Check if the list contains the number 10
// // // //         System.out.println("Contains 10? " + lis.contains(10)); // Prints: true

// // // //         // Iterate through the list and print each element
// // // //         System.out.print("Elements in the list: ");
// // // //         for (int i : lis) {
// // // //             System.out.print(i + " "); // Prints: 10 12
// // // //         }
// // // //     }
// // // // }  



// // // import java.util.concurrent.ExecutorService;
// // // import java.util.concurrent.Executors;
// // // public class Main{
// // //     public static void main(String[] args) {
// // //         ExecutorService executor = Executors.newFixedThreadPool(3);

// // //         Runnable task = () ->{
// // //             System.out.println(Thread.currentThread().getName()+" is executing ");
// // //         };
// // //         for(int i=0; i<5; i++){
// // //             executor.submit(task);

// // //         }
// // //         executor.shutdown();
// // //     }
// // // }



// // import java.util.concurrent.*;
// // import javax.security.auth.callback.Callback;
// // public class Main
// // {
// //     public static void main(String[] args) throws ExecutionException, InterruptedException
// //     {
// //         ExecutorService executor = Executors.newSingleThreadExecutor();
// //         Callable<Integer> task= ()->
// //         {
// //             Thread.sleep(3000);
// //             return 10*10;
// //         };
// //         Future<Integer> future = executor.submit(task);
// //         System.out.println( "Doing the task");
// //         Integer res = future.get();
// //         System.out.println("Result: "+res);
// //         System.out.println("Task");
// //         executor.shutdown();
// //     }
// // }


// // *
// // * ExecutorService -> Manage thread pool efficiently
// // * Callback and Future -> Run a task and return the result asynchronously
// // * CountDownLatch -> Synchronize threads by making them wait for other to complete
// // */
 
// //Executor [submit, shutdown]
 
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
 
// public class Main{
//     public static void main(String[] args){
//         ExecutorService pool = Executors.newFixedThreadPool(1);
//         //max threads that i can have is 3
//         //task
//         Runnable task = ()->{
//             System.out.println(Thread.currentThread().getName()+"is running");
//             try{
//                 Thread.sleep(2000);
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         };
//         //we have 3 threads but ill execute 5 process/task
//         for(int i=0;i<5;i++){
//             pool.submit(task);
//         }
 
//         //first 3 threads will execute 3 tasks in 2 sec
//         //last 2 tasks will get executed by 2 threds for additional 2 sec
//         //total time taken is 4 sec
//         pool.shutdown();
//     }
 
// }






