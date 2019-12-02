/**
 * 词语生成器，用于生成2字词语、3字词语和4字词语
 */
public class Terms {

    public String[] words;

    ChinaWordsDatabase cdb=new ChinaWordsDatabase();
    public Terms(int num)
    {
        for (int i=0;i<num;++i)
        {
            words[i]= cdb.GenRandomWord(34);
        }
    }
}
