package problemSolving;

class GreetingClass {

    private Integer integer = 10;

    public static synchronized void makeWish(String name) {
//        synchronized (GreetingClass.class) {
            for (int i=0;i<5;i++) {
                System.out.println("Wish Made by: "+ name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
//        }
    }

    public void sayBye(String name) {
        synchronized (GreetingClass.class) {
            for (int i=0;i<5;i++) {
                System.out.println("Bye: "+ name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
        }

    }

    public void sayHello(String name) {
        synchronized (integer) {
            for (int i=0;i<5;i++) {
                System.out.println("Hello: "+ name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) { }
            }
        }

    }

}


class Thread1 extends Thread {

    GreetingClass greetingClass;
    String name;

    Thread1(GreetingClass greetingClass,String name) {
        this.greetingClass = greetingClass;
        this.name = name;
    }

    @Override
    public void run() {
        greetingClass.makeWish(name);
    }
}

class Thread2 extends Thread {

    GreetingClass greetingClass;
    String name;

    Thread2(GreetingClass greetingClass,String name) {
        this.greetingClass = greetingClass;
        this.name = name;
    }

    @Override
    public void run() {
        greetingClass.makeWish(name);
    }
}

public class SyncTest {

    public static void main(String[] args) {

        GreetingClass greetingClass = new GreetingClass();
        GreetingClass greetingClass1 = new GreetingClass();

        Thread1 thread1 = new Thread1(greetingClass,"Rutul");
        Thread2 thread2 = new Thread2(greetingClass1,"Prithvi");

        thread1.start();
        thread2.start();

    }

}
