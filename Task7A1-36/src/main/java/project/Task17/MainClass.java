package project.Task17;

public class MainClass {
    public static void main(String[] args) {
        TriangleService triangleService = (a, b, c) -> {
            if (a + b > c) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(triangleService.createTriangle(7, 8, 10));
    }
}
