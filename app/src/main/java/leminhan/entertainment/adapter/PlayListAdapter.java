package leminhan.entertainment.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import leminhan.entertainment.R;

/**
 * Created by Le Minh An on 8/10/2016.
 */
public class PlayListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> playListModels;

    public PlayListAdapter(Context context,
                           ArrayList<String> _playListModels) {
        this.context = context;
        this.playListModels = _playListModels;
    }

    @Override
    public int getCount() {
        return playListModels.size();
    }

    @Override
    public Object getItem(int position) {
        return playListModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(
                    R.layout.item_listview_playlist, null);
        }
        TextView tv_name_playlist = (TextView) convertView
                .findViewById(R.id.tv_item_playlist);
        tv_name_playlist.setText(playListModels.get(position));
        return convertView;
    }
}
