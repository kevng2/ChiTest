public class CharacterBank {
    private WordandDef[] mWordBank;

    CharacterBank() {
        mWordBank = new WordandDef[15];
        mWordBank[0] = new WordandDef("天气", "weather");
        mWordBank[1] = new WordandDef("比", "compared with(comparison marker)" +
                "; to compare");
        mWordBank[2] = new WordandDef("下雪", "to snow");
        mWordBank[3] = new WordandDef("约", "to make an appointment");
        mWordBank[4] = new WordandDef("公园", "park");
        mWordBank[5] = new WordandDef("滑冰", "to ice skate");
        mWordBank[6] = new WordandDef("会", "will");
        mWordBank[7] = new WordandDef("冷", "cold");
        mWordBank[8] = new WordandDef("刚才", "just now, a moment ago");
        mWordBank[9] = new WordandDef("网上", "on the internet");
        mWordBank[10] = new WordandDef("预报", "to forecast; forecast");
        mWordBank[11] = new WordandDef("更", "even more");
        mWordBank[12] = new WordandDef("不但。。。而且", "not only..., but also...");
        mWordBank[13] = new WordandDef("暖和", "warm");
        mWordBank[14] = new WordandDef("办", "to handle, to do");
    }
}

class WordandDef {
    private String mCharacter;
    private String mDefinition;

    WordandDef(String character, String definition) {
        mCharacter = character;
        mDefinition = definition;
    }

    public String getCharacter() {
        return mCharacter;
    }

    public String getDefinition() {
        return mDefinition;
    }
}
