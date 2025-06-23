package com.NextGenius.quicknotes;

import android.widget.Filter;

import java.util.ArrayList;


public class FilteredClass extends Filter {
    ArrayList<ModalClass> filteredlist;
    RecyclerAdapter adapter;

    public FilteredClass(ArrayList<ModalClass> list , RecyclerAdapter adapter){
        this.filteredlist = list;
        this.adapter = adapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults filterresult = new FilterResults();
        if(constraint != null && constraint.length()>0){
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModalClass> filteredData = new ArrayList<>();
            for(int i =0 ; i<filteredlist.size() ; i++){
                if(filteredlist.get(i).title.toUpperCase().contains(constraint)){
                    filteredData.add(filteredlist.get(i));
                }
            }
            filterresult.count = filteredData.size();
            filterresult.values = filteredData;
        }else{
            filterresult.count = filteredlist.size();
            filterresult.values = filteredlist;
        }
        return filterresult;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
            adapter.arrayList = (ArrayList<ModalClass>) results.values;
            adapter.notifyDataSetChanged();
    }
}
