package com.example.chitest;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChineseAdapter extends RecyclerView.Adapter<ChineseAdapter.ChineseHolder> {
    private Vocab[] mVocab;
    private static final String TAG = "ChineseAdapter";

    public ChineseAdapter(Vocab[] vocab) {
        Log.d(TAG, "ChineseAdapter: called");
        mVocab = vocab;
    }

    @NonNull
    @Override
    public ChineseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: called");
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new ChineseHolder(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ChineseHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called" + position);
        if(position < mVocab.length) {
            String numVocab = (position + 1) + "\t" + mVocab[position].getCharacter();
            holder.mCharacter.setText(numVocab);
            holder.mPinyin.setText(mVocab[position].getPinyin());
            holder.mDefinition.setText(mVocab[position].getDefinition());
        }
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: called");
        return mVocab.length - 1;
    }

    public class ChineseHolder extends RecyclerView.ViewHolder {
        TextView mCharacter, mPinyin, mDefinition;
        public ChineseHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.vocab_list, parent, false));
            Log.d(TAG, "ChineseHolder: called");
            mCharacter = itemView.findViewById(R.id.character);
            mPinyin = itemView.findViewById(R.id.pinyin);
            mDefinition = itemView.findViewById(R.id.definition);
        }
    }
}
