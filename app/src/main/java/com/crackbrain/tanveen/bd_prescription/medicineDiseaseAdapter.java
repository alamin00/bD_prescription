package com.crackbrain.tanveen.bd_prescription;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Al on 9/11/2015.
 */
public class medicineDiseaseAdapter extends BaseExpandableListAdapter
{
    private Context ctx ;
    private List<String> diseaseList;
    private HashMap<String, List<String>> diseaseCategory;

    public medicineDiseaseAdapter(Context ctx, HashMap<String, List<String>> diseaseCategory, List<String> diseaseList)
    {
        this.ctx = ctx;
        this.diseaseCategory = diseaseCategory;
        this.diseaseList = diseaseList;
    }

    @Override
    public int getGroupCount() {
        return diseaseList.size();
    }

    @Override
    public int getChildrenCount(int arg0) {
        return diseaseCategory.get(diseaseList.get(arg0)).size();
    }

    @Override
    public Object getGroup(int arg0) {
        return diseaseList.get(arg0);
    }

    @Override
    public Object getChild(int parent, int child)
    {

        return diseaseCategory.get(diseaseList.get(parent)).get(child);
    }

    @Override
    public long getGroupId(int arg0) {
        return arg0;
    }

    @Override
    public long getChildId(int parent, int child) {


        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int parent, boolean isExpanded, View convertView, ViewGroup parentView) {

        String group_title = (String)getGroup(parent);
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.medicine_parent_layout,parentView,false);
        }
        TextView parent_textView =(TextView) convertView.findViewById(R.id.txtParent);

        parent_textView.setText(group_title);


       /* if (isExpanded) {
            groupHolder.img.setImageResource(R.drawable.pc1);
        } else {
            groupHolder.img.setImageResource(R.drawable.pc2);
        }
*/
        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean lastChild, View convertView, ViewGroup parentView)
    {
        String child_title = (String)getChild(parent,child);

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.medicine_child_layout,parentView,false);

        }

        TextView child_textView =(TextView) convertView.findViewById(R.id.txtChild);

        child_textView.setText(child_title);

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition)
    {
        return true; // for clickable the child listview
    }
}
