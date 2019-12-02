import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
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
    //字典声明
    public Map<String,String> CommonTerms=new HashMap<String,String>();
    //常用对仗库
    public void TermsSpwaner()
    {
        CommonTerms.put("天","地");
        CommonTerms.put("雨","风");
        CommonTerms.put("大陆","长空");
        CommonTerms.put("山花","海树");
        CommonTerms.put("赤日","苍穹");
        CommonTerms.put("雷隐隐","雾蒙蒙");
        CommonTerms.put("日下","天中");
        CommonTerms.put("风高秋月白","雨霁晚霞红");
        CommonTerms.put("牛女二星河左右","参商两曜斗西东");
        CommonTerms.put("十月塞边","三冬江上");
        CommonTerms.put("飒飒寒霜惊戍旅","漫漫朔雪冷鱼翁");
        CommonTerms.put("河","汉");
        CommonTerms.put("绿","红");
        CommonTerms.put("雨伯","雷公");
        CommonTerms.put("烟楼","雪洞");
        CommonTerms.put("月殿","天宫");
        CommonTerms.put("云叆叇","日曈朦");
        CommonTerms.put("腊屐","渔蓬");
        CommonTerms.put("过天星似箭","吐魄月如弓");
        CommonTerms.put("驿旅客逢梅子雨","池亭人挹藕花风");
        CommonTerms.put("茅店村前","板桥路上");
        CommonTerms.put("皓月坠林鸡唱韵","青霜锁道马行踪");
        CommonTerms.put("山","海");
        CommonTerms.put("华","嵩");
        CommonTerms.put("四岳","三公");
        CommonTerms.put("宫花","禁柳");
        CommonTerms.put("塞雁","江龙");
        CommonTerms.put("清暑殿","广寒宫");
        CommonTerms.put("拾翠","题红");
        CommonTerms.put("庄周梦化蝶","吕望兆飞熊");
        CommonTerms.put("北牖当风停夏扇","南檐曝日省冬烘");
        CommonTerms.put("鹤舞楼头","凤翔台上");
        CommonTerms.put("玉笛弄残红子月","紫箫吹断美人风");
    }

    //助词
    public String[] AuxiliaryWord={
       "之","乎","者","也"
    };

    public String GenRandomWord(int seed)
    {
        /*Random r=new Random();
        return chinaWords[r.nextInt(chinaWords.length)];*/
        String str = "";
        int hightPos; //
        int lowPos;

        Random random = new Random();

        hightPos = (176 + Math.abs(random.nextInt(39)));
        lowPos = (161 + Math.abs(random.nextInt(93)));

        byte[] b = new byte[2];
        b[0] = (Integer.valueOf(hightPos)).byteValue();
        b[1] = (Integer.valueOf(lowPos)).byteValue();

        try {
            str = new String(b, "GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("错误");
        }

        return str;
    }
}
