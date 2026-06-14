public class Qingchun {
    public static void main(String[] args) {
        long N = 2026202520242023L;
        long count;
        if (N % 2 == 0) {
            count = N / 2;
        } else {
            count = (N + 1) / 2;
        }
        System.out.println(count);
    }
}