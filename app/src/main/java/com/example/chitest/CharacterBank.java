package com.example.chitest;

public class CharacterBank {
    private Vocab[] mWordBank;

    CharacterBank() {
        mWordBank = new Vocab[15];
        mWordBank[0] = new Vocab("天气", "tiānqì", "weather");
        mWordBank[1] = new Vocab("比", "bǐ", "compared with(comparison marker)" +
                "; to compare");
        mWordBank[2] = new Vocab("下雪", "xià xuě", "to snow");
        mWordBank[3] = new Vocab("约", "yuē", "to make an appointment");
        mWordBank[4] = new Vocab("公园", "gōngyuán", "park");
        mWordBank[5] = new Vocab("滑冰", "huá bīng", "to ice skate");
        mWordBank[6] = new Vocab("会", "huì", "will");
        mWordBank[7] = new Vocab("冷", "lěng", "cold");
        mWordBank[8] = new Vocab("刚才", "gāngcái", "just now, a moment ago");
        mWordBank[9] = new Vocab("网上", "wǎng shang", "on the internet");
        mWordBank[10] = new Vocab("预报", "yùbào", "to forecast; forecast");
        mWordBank[11] = new Vocab("更", "gèng", "even more");
        mWordBank[12] = new Vocab("不但。。。而且", "búdàn..., érqiě...",
                "not only..., but also...");
        mWordBank[13] = new Vocab("暖和", "nuǎnhuo", "warm");
        mWordBank[14] = new Vocab("办", "bàn", "to handle, to do");
    }

    String getCharacter(int position) {
        return mWordBank[position].getCharacter();
    }

    String getDefinition(int position) {
        return mWordBank[position].getDefinition();
    }

    String getPinyin(int position) {
        return mWordBank[position].getPinyin();
    }

    Vocab[] getWordBank() {
        return mWordBank;
    }
}

class Vocab {
    private String mCharacter;
    private String mDefinition;
    private String mPinyin;

    Vocab(String character, String pinyin, String definition) {
        mCharacter = character;
        mPinyin = pinyin;
        mDefinition = definition;
    }

    public String getCharacter() {
        return mCharacter;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public String getPinyin() {
        return mPinyin;
    }
}
