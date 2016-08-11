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
public class KenhTheThaoAdapter extends BaseAdapter {
    String[] result;
    Context context;
    int[] imageId;

    public KenhTheThaoAdapter(Context context, String[] prgmNameList, int[] prgmImages) {
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
            v = inflater.inflate(R.layout.items_gridview_album, parent, false);
        } else {
            v = (View) convertView;
        }

        // TODO Auto-generated method stub
        Holder holder = new Holder();
        holder.tv = (TextView) v.findViewById(R.id.textView111);
        holder.img = (ImageView) v.findViewById(R.id.imageView111);

        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        v.setLayoutParams(new GridView.LayoutParams(params));

        v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }

}
