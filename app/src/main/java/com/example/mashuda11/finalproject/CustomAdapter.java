package com.example.mashuda11.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<String >> childtitle;
    private List<String> headertitle;
    private android.R.attr R;

    public CustomAdapter(Context context, List<String> headertitle, HashMap<String, List<String>> childtitle) {
        this.context = context;
        this.childtitle = childtitle;
        this.headertitle = headertitle;
    }

    public CustomAdapter(CustomAdapter customAdapter) {
    }


    @Override
    public int getGroupCount() {
        return 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {

        return this.childtitle.get(this.headertitle.get(groupPosition)).size();
    }



    @Override
    public Object getGroup(int groupPosition)
    {

        return this.headertitle.get(groupPosition);
    }



    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.childtitle.get(this.headertitle.get(groupPosition)).get(childPosition);
    }




    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    


    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String listTitle = (String) getGroup(groupPosition);
         if(convertView == null){

            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.group_header, null);
        }



        TextView listTitleTextView = (TextView) convertView.findViewById(R.id.title);

        listTitleTextView.setText(listTitle);
        return convertView;
    }






    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final String expandedListText = (String) getChild(groupPosition, childPosition);
        if(convertView == null){

            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.child_item,null);
        }


        TextView expandedlistTextView = (TextView) convertView.findViewById(R.id.childitem);

       expandedlistTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
