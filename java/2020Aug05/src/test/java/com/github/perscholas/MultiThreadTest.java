package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class MultiThreadTest {
    public static void main(String[] args) {
//        multiThreadWithThreadExtension();
//        multiThreadWithComposingRunnable();
//        multiThreadWithComposingThread();
    }

    public static void multiThreadWithThreadExtension() {
        // given
        Thread fred1 = new ThreadExtension("Fred 1");
        Thread fred2 = new ThreadExtension("Fred 2");
        fred2.setPriority(6);

        // when
        fred1.start();
        fred2.start();
        System.out.println("Next instruction no problem");

        // then
    }

    public static void multiThreadWithComposingRunnable() {
        // given
        Thread fred1 = new Thread(new RunnableImplementation(), "Fred 1");
        Thread fred2 = new Thread(new RunnableImplementation(), "Fred 2");

        // when
        fred1.start();
        fred2.start();
        System.out.println("Next instruction no problem");

        // then
    }

    public static void multiThreadWithComposingThread() {
        // given
        Runnable fred1 = new ThreadExtension("Fred 1");
        Thread fred2 = new Thread(fred1, "Fred 2");

        // when
        fred2.start();
        System.out.println("Next instruction no problem");
        // then
    }
}
