public class ThreadL1C60 extends thread {
ThreadL1C4 x;
ArrayBlockingQueue l;
public  ThreadL1C60(ThreadL1C4 x1) {
x=x1;

l=new ArrayBlockingQueue();


}

public void run() {
x.l.add(new Send26());

}

}