public class Baskin {
    public static int baskin(int num) {
        // If 1 or 0, possibility counts as 1 for adding possibilities recursively
        if (num == 1 || num == 0) {
            return 1;
        }
        // Recursively add possibilities, each time removing 1 or 2 from num
        return baskin(num - 1) + baskin(num - 2);
    }
    public static void main(String[] args) {
        System.out.println(baskin(5));
    }
}