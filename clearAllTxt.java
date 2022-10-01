import java.io.FileWriter;
import java.io.IOException;

public class clearAllTxt {
    public static void main(String[] args) {
        //清空两个txt
        try{
            new FileWriter("Exercises.txt").write("");
            new FileWriter("Answers.txt").write("");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
