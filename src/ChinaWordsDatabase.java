import java.util.Random;

/**
 * 汉字库
 */
public class ChinaWordsDatabase {
    public String[] chinaWords={
            "胞","包","褒","剥","薄","雹","保","堡","饱","宝","抱","报","暴","豹","鲍","爆",
            "兵","或","火","汉","和","好","会","数","你","床","明","鱼","于","玉","雨","语",
            "美", "是","时","石","看","了","从","啊","人","类","在","他","个","归","群","空",
            "新", "说","再","呢","搞","司","破","留","风","陆","月","打","芭","依","双","见",
            "奥","这","执","欧"
    };

    public String GenRandomWord(int seed)
    {
        Random r=new Random();
        return chinaWords[r.nextInt(chinaWords.length)];
    }
}
