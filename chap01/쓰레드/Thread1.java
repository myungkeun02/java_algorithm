package 쓰레드;

import java.util.ArrayList;


public class Thread1 extends Thread {

    int seq;

    public Thread1(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + "thread start");
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (Exception e) {

        }
        System.out.println(this.seq + "thread end");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // 총 10개의 쓰레드를 생성하여 실행한다.
            Thread t = new Thread1(i);
            t.start();
            threads.add(t);
        }
        for (int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            } catch (Exception e) {
            }
        }
        System.out.println("main thread end");
    }
}
