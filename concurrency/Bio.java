package concurrency;

public class Bio {

    public static int dnaDouble(int n) {
        return n * 2;
    }

    public static void main(String[] args) {

        int answer = 10;
        for(int i = 0; i < 9; i++) {
            answer = dnaDouble(answer);
        }

        System.out.println(answer);
    }


}
