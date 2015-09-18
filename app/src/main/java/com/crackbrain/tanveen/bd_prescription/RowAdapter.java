package com.crackbrain.tanveen.bd_prescription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Al on 5/19/2015.
 */
public class RowAdapter extends ArrayAdapter<String>
{
    public RowAdapter(Context context, String[] name) {
        super(context, R.layout.rowdesign,name);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater li = LayoutInflater.from(getContext());
        View view = li.inflate(R.layout.rowdesign,parent,false);
        String nameItem = getItem(position);
        TextView tv = (TextView)view.findViewById(R.id.tv);
        ImageView iv = (ImageView)view.findViewById(R.id.img);
        tv.setText(nameItem);
        iv.setImageResource(R.drawable.lg);
        return  view;




    }
}
