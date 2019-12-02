import java.util.ArrayList;
import java.util.List;

/**
 * 汉字处理
 */
public class ChinaWordsProcess {

    ChinaWordsDatabase cdb=new ChinaWordsDatabase();

    public String TakeWords()
    {
        return cdb.GenRandomWord(78);
    }
    public String TakeWords(String format)
    {
        return null;
    }

    /**
     * 生成一行诗句
     * @param wordsNum 一行几个字，即几言诗
     * @return
     */
    public String GetLines(int wordsNum)
    {
        List<String> words = new ArrayList<>();
        String lines = "";
        for (int i=0;i<wordsNum;i++)
        {
            words.add(TakeWords());
        }
        for(int i=0;i<words.size();i++)
        {
            lines=lines+ words.get(i);
        }
        return lines;
    }

}
