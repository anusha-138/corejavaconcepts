package com.corejava.concepts.multithreading;

public class CreateThreadByExtending extends Thread{

    public void run(){

        System.out.println("Child Thread");// this is called job of the thread
        System.out.println("No-arg-run"); // run method with no argument
    } //overrides the Thread run() method
    public void run(int i){
        System.out.println("run with arg");// start method calls default run method
    }

    public static void main(String[] args) {
        CreateThreadByExtending thread = new CreateThreadByExtending();// thread instantiation
        thread.start();// starting the thread
        System.out.println("Thread 1 state "+thread.getState()); // returns state of the thread
        for(int i=0;i<3;i++){
            System.out.println("Main thread"); // main Thread starts child thread ( both jobs are running simultaneously)
            /*We cannot expect the order of execution as it is handled by ThreadScheduler, It varies from JVM to JVM */
        }
        CreateThreadByExtending thread2 = new CreateThreadByExtending();// thread instantiation
        thread2.run();/*Only one thread is executed, run method is called as normal method call.
         Hence, order will be child, main. The run method is called before execution*/
        System.out.println("Thread 2 state "+thread2.getState());
        for(int i=0;i<3;i++){
            System.out.println("Output 2: Main thread");
        }
    }


}
