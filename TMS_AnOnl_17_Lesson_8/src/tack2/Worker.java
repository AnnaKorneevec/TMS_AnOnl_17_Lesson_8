package tack2;

public class Worker implements Post {
    @Override
    public void getPost() {
        System.out.println("Я рабочий");
    }
}