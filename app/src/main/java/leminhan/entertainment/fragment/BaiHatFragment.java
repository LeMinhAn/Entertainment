package leminhan.entertainment.fragment;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import leminhan.entertainment.ListMusicActivity;
import leminhan.entertainment.R;

/**
 * Created by Le Minh An on 8/8/2016.
 */
public class BaiHatFragment extends Fragment {
    RelativeLayout rl_baihat;
    View view;

    public BaiHatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_baihat, container, false);

        initView();
        initAction();
        return view;

    }

    private void initView() {
        rl_baihat = (RelativeLayout) view.findViewById(R.id.rl_baihat1);
    }

    private void initAction() {
        rl_baihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ListMusicActivity.class);
                startActivity(intent);
            }
        });

    }


}
