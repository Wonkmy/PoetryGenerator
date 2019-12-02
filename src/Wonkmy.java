import java.util.List;
import java.util.Random;

public class Wonkmy {
    public static void main(String[] args)
    {
        //System.out.println("我是跨平台语言java");
        Poetry poetry=new Poetry();
        List<String> newPoetry = poetry.CreatePoetry("静夜思",4,5);
        poetry.SharePoetry(newPoetry);
    }
}
