package reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fuchun.hu@hand-china.com(胡馥春)
 * @version 1.0
 * @name TwoThread
 * @description
 * @date 2018/6/28
 */
public class TwoThread {

    private int start = 1;

    private boolean flag = false;

    private final static Lock lock = new ReentrantLock();

   /* public static void main(String[] args){
        TwoThread twoThread = new TwoThread();

        Thread t1 = new Thread(new OuNum(twoThread));
        t1.setName("t1");
    }*/

    /**
     *
     */
    public class OuNum implements Runnable {

        private TwoThread number;

        public OuNum(TwoThread number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {

            }
        }
    }

}

