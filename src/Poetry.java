import java.util.ArrayList;
import java.util.List;

/**
 * 诗类
 */
public class Poetry {
    /**
     * 创建一首诗
     * @param poetryTitle 诗的标题
     * @param lines 诗的行数
     */
    public List<String> CreatePoetry(String poetryTitle,int lines,int words)
    {
        System.out.println("    "+poetryTitle+"   ");
        ChinaWordsProcess chinaWordsProcess=new ChinaWordsProcess();
        List<String> poetry=new ArrayList<>();;
        for(int i=0;i<lines;i++)
        {
            poetry.add( chinaWordsProcess.GetLines(words));
        }
        return poetry;
    }

    public void SharePoetry(List<String> poetry)
    {
        for (String s : poetry)
        {
            System.out.println(s);
        }
    }

    /**
     * 对生成的诗词进行格式上的修整
     * @param poetry
     */
    public void FormatPoetry(List<String> poetry)
    {
        for (String s : poetry)
        {

        }
    }

}
