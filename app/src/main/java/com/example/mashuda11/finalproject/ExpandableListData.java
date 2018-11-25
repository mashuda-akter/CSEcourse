package com.example.mashuda11.finalproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListData {


    public static HashMap<String, List<String>> getData(){
        HashMap<String, List<String>> expandableListViewDetail = new HashMap<String,List<String>>();
        List<String> Apple = new ArrayList<String>();
        Apple.add("iphone");
        Apple.add("ipad");
        Apple.add("macbook");
        List<String> Samsung = new ArrayList<String>();

        Samsung.add("iphone");
        Samsung.add("ipad");
        Samsung.add("macbook");

        expandableListViewDetail.put("Samsung", Samsung);
        expandableListViewDetail.put("Apple", Apple);

        return expandableListViewDetail;
    }

    public void setAdapter(CustomAdapter customAdapter) {
    }
}


