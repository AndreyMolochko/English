package com.ostrovec.english.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TopWordsAdapter extends BaseAdapter {

    private List<String> tops;
    private Context context;

    public TopWordsAdapter(List<String> tops){
        this.tops = tops;
    }

    @Override
    public int getCount() {
        return tops.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView topView = new TextView(context);
        topView.setText(tops.get(position));

        return topView;
    }
}
