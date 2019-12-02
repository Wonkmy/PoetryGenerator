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
    public String CreatePoetry(String poetryTitle,int lines,int words)
    {
        ChinaWordsProcess chinaWordsProcess=new ChinaWordsProcess();
        List<String> poetry=new ArrayList<>();;
        String newpoetry = "";
        for(int i=0;i<lines;i++)
        {
            poetry.add( chinaWordsProcess.GetLines(words));
        }
        for(int i=0;i<poetry.size();i++)
        {
            newpoetry=newpoetry+ poetry.get(i);
        }
        return newpoetry;
    }

}
