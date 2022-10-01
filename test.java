import java.io.File;

public class test{
    public static void main(String[] args) {
        //第一次运行时需要创建Exercises.txt和Answers.txt
        File file1 = new File("Exercises.txt");
        File file2 = new File("Answers.txt");
        //完成
        new creatExercises();
    }
}
