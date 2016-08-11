package leminhan.entertainment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import leminhan.entertainment.R;

/**
 * Created by Le Minh An on 8/10/2016.
 */
public class NoiBatAdapter extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;

    public NoiBatAdapter(Context context, String[] prgmNameList, int[] prgmImages) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.result = prgmNameList;
        this.imageId = prgmImages;


    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder {
        TextView tv;
        ImageView img;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.items_horizontallistview_noibat, parent, false);
        } else {
            v = (View) convertView;
        }

        // TODO Auto-generated method stub
        Holder holder = new Holder();
        holder.tv = (TextView) v.findViewById(R.id.tv_noibat);
        holder.img = (ImageView) v.findViewById(R.id.iv_noibat);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        return v;
    }

}
