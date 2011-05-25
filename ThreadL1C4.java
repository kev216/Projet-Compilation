public class ThreadL1C4 extends thread {
int x;
ArrayBlockingQueue l;
public  ThreadL1C4(int x1) {
x=x1;

l=new ArrayBlockingQueue();


}

public void run() {
l.take().val();

}

}