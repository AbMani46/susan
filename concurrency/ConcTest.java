package concurrency;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class ConcTest {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        var futures = new ArrayList<Future<Integer>>();

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            futures.add(executor.submit(() -> finalI));
        }

        executor.shutdown();

        List<Integer> safeList = futures.stream()
                .map(ConcTest::retrieveFuture)
                .toList();

        System.out.println(safeList);


    }

    public static int retrieveFuture(Future<Integer> future) {
        int got;
        try{
            got = future.get();


        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        return got;
    }
}
