package HomeWorkLesson1.Task1;

public class Task1Runner {
    public static void main(String[] args) {
        Shuffle shuffleRun = new Shuffle();
        shuffleRun.xShuffle();
        TestClassHomeWork1Variant1 testClassHW1run = new TestClassHomeWork1Variant1();
        testClassHW1run.runTestClassHW1();
        TestClassHomeWork1Variant2 testClassHW2run = new TestClassHomeWork1Variant2();
        testClassHW2run.runTestClassHW2();
        TestClassHomeWork1Variant3 testClassHW3run = new TestClassHomeWork1Variant3();
        testClassHW3run.runTestClassHW3();
        PoolPuzzleOne xPullPuzzleOne = new PoolPuzzleOne();
        xPullPuzzleOne.runPoolPuzzleOne();
        PoolPuzzleTask1 xPullPuzzle = new PoolPuzzleTask1();
        xPullPuzzle.runPoolPuzzleTask1();
    }
}
