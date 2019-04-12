package com.ostrovec.english.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.ostrovec.english.R;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopWordsAdapter extends BaseAdapter {

    @BindView(R.id.item_grid_view_name_text_view)
    TextView textView;

    @BindView(R.id.item_grid_view_bronze_medal_image_view)
    ImageView bronzeMedalView;

    @BindView(R.id.item_grid_view_silver_medal_image_view)
    ImageView silverMedalView;

    @BindView(R.id.item_grid_view_gold_medal_image_view)
    ImageView goldMedalView;

    @BindView(R.id.item_grid_view_progress_bar)
    ProgressBar progressBar;

    @BindView(R.id.item_grid_view_value_progress_text_view)
    TextView valueProgressValue;



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
        ButterKnife.bind(this,convertView);
        textView.setText(name);
        progressBar.setProgress(30);
        valueProgressValue.setText("30%");

        return convertView;
    }
}
