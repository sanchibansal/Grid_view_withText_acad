package com.example.sakshi.grid_view_acad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sakshi on 04-07-2017.
 */

public class ImageClass extends BaseAdapter {
    private int imageid[];
    private Context context;
    private String names[];
    private LayoutInflater mInflator;

    //parameterized constructor
    public ImageClass(Context context, int imageid[], String names[]){
        this.context=context;
        this.imageid=imageid;
        this.names=names;
        mInflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);        //inflating
    }
    @Override
    public int getCount() {
        return imageid.length;
    }

    @Override
    public Object getItem(int position) {
        return imageid[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = mInflator.inflate(R.layout.img_layout,null);        //inflating the view with inflator
        ImageView image = (ImageView)convertView.findViewById(R.id.img);       //Associating ImageView in the image_layout layout
        image.setImageResource(imageid[position]);      //setting image in the imageView
        TextView text = (TextView)convertView.findViewById(R.id.name);  //Associating Textview in the image_layout layout
        text.setText(names[position]);  //setting text in the TextView
        return convertView;         //returning view
    }
}
