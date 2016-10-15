package com.example.android_protice5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/7.
 */
public class MyAdapter extends AbsListView.RecyclerListener {
    private String[] mDataset;

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.myview, parent, false);
        ViewHolder vh = new ViewHolder(V);
        return vh;
    }

    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int postion) {
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.textView);

        }
    }
}

