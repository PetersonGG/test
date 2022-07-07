package mb.test;

import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Future<String> submit = executor.submit(new ca());
        executor.execute(new ru());


        HashSet<String> strings = new HashSet<String>();

    }
}

class ru implements Runnable{

    @Override
    public void run() {

    }
}

class ca implements Callable<String>{

    @Override
    public String call() throws Exception {
        return null;
    }
}
