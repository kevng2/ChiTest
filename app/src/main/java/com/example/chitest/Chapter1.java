package com.example.chitest;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class Chapter1 extends AppCompatActivity {
    //TextView mCharacter, mPinyin, mDefinition;
    CharacterBank mChapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        mChapter1 = new CharacterBank();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ChineseAdapter chineseAdapter = new ChineseAdapter(mChapter1.getWordBank());
        recyclerView.setAdapter(chineseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(Chapter1.this));
    }
}
