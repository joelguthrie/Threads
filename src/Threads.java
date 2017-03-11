/**
 * Created by Joel on 3/9/2017.
 */
class Threads extends Thread {

    public void run(){
        for(int i=1; i <=5; i++){
            System.out.println(Thread.currentThread().getId() + " This is a Thread");
        }
    }
}

class ThreadsPractice2 {

    public static void main(String[] args) {
        Threads thread_1 = new Threads();
        thread_1.start();

        Threads thread_2 = new Threads();
        thread_2.start();

        Threads thread_3 = new Threads();
        thread_3.start();
    }
}




