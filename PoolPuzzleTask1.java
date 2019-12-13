package HomeWorkLesson1.Task1;

public class PoolPuzzleTask1 {
        public void runPoolPuzzleTask1(){
            int x=0;
            //1st insert in brackets
            while(x<4) {
                //2nd insert
                System.out.print("a");
                //hardcoded
                if(x<1){
                    //3rd insert
                    System.out.print(" ");
                }
                //4th insert
                System.out.print("n");
                //5th insert 2 lines and in brackets
                if(x>1){
                    System.out.print(" oyster");
                    x=x+2;
                }
                if(x==1) {
                    //6th insert 1 line
                    System.out.print("noys");
                }
                //7t insert 1 line and in brackets
                if(x<1){
                    System.out.print("oise");
                }
                System.out.print(" ");
                //8th insert
                x=x+1;
            }
        }
    }