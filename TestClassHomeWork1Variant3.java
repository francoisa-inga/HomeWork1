package HomeWorkLesson1.Task1;
//This scenario gives 02 14 25 36 47

public class TestClassHomeWork1Variant3 {
    public void runTestClassHW3() {
        int x = 0;
        int y = 0;
        while (x < 5) {
            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }
            System.out.print(x + " " + y + " ");
            x = x + 1;
    }
    }
}
