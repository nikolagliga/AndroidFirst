package com.example.Nikola1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by GLIGA on 12/01/2015.
 */
public class MainActivityListAdapter extends BaseAdapter {

    private ArrayList<String> tasks;

    public MainActivityListAdapter(ArrayList<String> tasks){
        this.tasks = tasks;
    }

    @Override
    public int getCount() {
        if (tasks != null)
            return tasks.size();
        else
            return  0;
    }

    @Override
    public String getItem(int position) {
        if (tasks != null)
            return tasks.get(position);
        else
            return  null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
