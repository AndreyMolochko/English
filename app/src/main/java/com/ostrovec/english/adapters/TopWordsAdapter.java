package com.ostrovec.english.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ostrovec.english.R;

import java.util.List;

public class TopWordsAdapter extends BaseAdapter {

    private List<String> tops;
    private Context context;

    public TopWordsAdapter(Context context, List<String> tops){
        this.tops = tops;
        this.context = context;
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

        String name = tops.get(position);

        if(convertView == null){
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.top_words_item_grid_view,null);
        }

        TextView textView = convertView.findViewById(R.id.item_grid_view_name_text_view);
        textView.setText(name);



        return convertView;
    }
}
