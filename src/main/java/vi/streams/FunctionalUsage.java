package vi.streams;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.function.Predicate;

/**
 * Implement functional interfaces using lambda expressions, including interfaces from the java.util.function package
 * A functional interface has only one abstract method but it can have multiple default methods.
 * @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of this annotation is optional.
 *
 */
public class FunctionalUsage {

    public static void main(String[] args) {
        FunctionalUsage thisClass = new FunctionalUsage();
        thisClass.createThreadUsingAnonymousInnerClass();
        thisClass.createThreadFunctionalLambdaWay();
        System.out.println("Get square of 4: " + thisClass.getSquareOfNumber(4));
        List<String> names = DataHelper.createListOfNames();
        thisClass.checkListForString(names, "CHRIS");

        System.out.println("Number of threads: " + thisClass.findNumberOfActiveThreads());
        System.out.println("Current Thread Group Active count: " + thisClass.getThreadActiveGroupCount());
        System.out.println("Number of threads from JMX API: " + thisClass.getThreadCountUsingJMX());
    }

    public void createThreadUsingAnonymousInnerClass() {
        new Thread(new Runnable() {
            public void run()
            {
                System.out.println("New Thread created via anonymous inner class");
            }
        }).start();
        System.out.println("Current Thread Group - " + Thread.currentThread().getThreadGroup().getName());
    }

    public void createThreadFunctionalLambdaWay() {
        new Thread(() -> {
            System.out.println("New Thread created via functional lambdas");
        }).start();
    }

    /**
     * Square is a functional interface with one abstract method
     * @param number
     * @return
     */
    public int getSquareOfNumber(int number) {
        Square s = (int x) -> x * x;
        return s.calculateSquare(number);
    }

    public boolean checkListForString(List<String> names, String name){
        boolean nameInList = false;
        Predicate<String> p = (s) -> s.startsWith(name);
        for (String eachName : names) {
            if(p.test(eachName)) {
                System.out.println(eachName);
                nameInList = true;
            }
        }
        return nameInList;
    }


    /**
     * activeCount() only returns the number of threads in the same threadGroup
     * If there are many thread groups in a Java application, activeCount() won't give a correct output. For example, it won't return the number of GC threads.
     * @return
     */
    public int findNumberOfActiveThreads() {
        return Thread.activeCount();
    }

    public int getThreadActiveGroupCount() {
        return Thread.currentThread().getThreadGroup().activeGroupCount();
    }

    /**
     * This API returns the total number of threads from all thread groups, GC, JMX etc.
     * @return
     */
    public int getThreadCountUsingJMX() {
        return ManagementFactory.getThreadMXBean().getThreadCount();
    }


}
