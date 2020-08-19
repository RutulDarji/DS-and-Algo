package problemSolving;

import java.io.File;
import java.util.*;

class Parent implements Comparable<Child> {
    int x;
    Parent(int x) {
        this();
        this.x = x;
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().hashCode());
        return;
    }

    Parent() {

    }

    @Override
    public int compareTo(Child o) {
        return 0;
    }
}

class Child extends Parent{
    int y;

    Child(int x,int y) {
        super(x);
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().hashCode());
        this.y = y;
    }
}

interface testInterface {
    void setName();
    default void setDescription() {
        System.out.println("XYZ");
    }

    static void setTest() {
        System.out.println("Static");
    }
}

interface testInterface1 {
    void setName();
    default void setDescription() {
        System.out.println("XYZ");
    }
    static void setTest() {
        System.out.println("Static");
    }
}

interface A {
    default void defaultMethod() {
        System.out.println("A");
    }
}

interface B extends A {
    default void defaultMethod() {
        System.out.println("B");
    }
}

interface C extends A {
    void defaultMethod();
}

public class Test implements testInterface,testInterface1,B,C,A {

    static int minimumSwaps(int[] arr) {
        int n = arr.length-1;
        int swapCount = 0;

        for(int i=0;i<n;i++) {
            System.out.println("i --> "+i);
            if(i<arr[i]-1) {
                System.out.println("i --> "+i + " arr[i]-1 --> " + (arr[i]-1));
                swap(arr,i,Math.min(n,arr[i]-1));
                swapCount++;
                i--;
            }
        }

        return swapCount;
    }

    private static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        /*int n = Integer.MIN_VALUE-1;
        System.out.println(n);
        for (int i=0;i<4;i++) {
            n = n-1;
            System.out.println(n);
        }

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MAX_VALUE+1);
        System.out.println(Double.MAX_VALUE*2);
        System.out.println(Double.MAX_VALUE*-2);

        System.out.println(Double.MIN_VALUE*2);
        System.out.println(Double.MIN_VALUE*-2);
        System.out.println(Math.sqrt(-1));
        double zero = 0;
        System.out.println(zero/zero);
        System.out.println("INFINITY - INFINITY = " +
                (Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY));
        System.out.println("INFINITY * ZERO = " + (Double.POSITIVE_INFINITY * zero));

        Map<Integer,String> map = new HashMap<>();
        map.put(null,"x ");
        map.put(null,"");
        System.out.println(map);

        Set<Integer> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set);*/

//        File file = new File("/abc/abc.txt");
//        String fileName = file.getName();
//        if (file.isFile()) {
//            System.out.println("Exist");
//        } else {
//            System.out.println(" Not Exist");
//        }
//
//        try {
//            System.out.println("try");
//            System.exit(1);
//        }catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("Finally");
//        }
//
//
//        List<String> list =
//                Collections.synchronizedList(new ArrayList<String>());
//
//        list.add("practice");
//        list.add("code");
//        list.add("quiz");
//
//        synchronized(list)
//        {
//            // must be in synchronized block
//            Iterator it = list.iterator();
//
//            while (it.hasNext())
//                System.out.println(it.next());
//        }

        int arr[] = { 4 ,3 ,1 ,2 };
        minimumSwaps(arr);

        Integer integer = null;
        System.out.println(String.valueOf(integer));
//        System.out.println(integer.toString());


        char[] charArray= {'1','2','3','4'};
        String newString = new String(charArray);
//        newString.intern();


        System.out.println(newString.hashCode());
        String checkIntern  = "1234";
        System.out.println(checkIntern.hashCode());


    }

    @Override
    public void setName() {

    }

    @Override
    public void setDescription() {
        testInterface.super.setDescription();
        testInterface1.super.setDescription();
    }

    public void setTest() {
        testInterface.setTest();
        testInterface1.setTest();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void defaultMethod() {
        System.out.println("CDD");
    }
}


