// Th1 class that extends Thread
class Th1 extends Thread {
    public void run() {
        int a = 10, b = 5;
        System.out.println(a + b);  // Addition
        System.out.println(a - b);  // Subtraction
        System.out.println(a * b);  // Multiplication
        System.out.println(a / b);  // Division
    }

    public static void main(String[] args) {
        Th1 t = new Th1();  // Create an instance of Th1
        t.start();  // Start the thread
    }
}

// Th2 class that implements Runnable
class Th2 implements Runnable {
    public void run() {
        int a = 10, b = 5;
        System.out.println(a + b);  // Addition
        System.out.println(a - b);  // Subtraction
        System.out.println(a * b);  // Multiplication
        System.out.println(a / b);  // Division
    }

    public static void main(String[] args) {
        Th2 runnableInstance = new Th2();  // Create an instance of Th2
        Thread t1 = new Thread(runnableInstance);  // Create a new Thread with Th2
        t1.start();  // Start the thread
    }
}
