package leminhan.entertainment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import leminhan.entertainment.R;
import leminhan.entertainment.adapter.NgheSiAdapter;

/**
 * Created by Le Minh An on 8/8/2016.
 */
public class NgheSiFragment extends Fragment {
    ListView lv_nghesi;
    public static String[] prgmNameList = {"Let Us C", "c++", "JAVA", "Jsp", "Microsoft .Net", "Android", "PHP", "Jquery", "JavaScript"};
    public static int[] prgmImages = {R.drawable.icon_download, R.drawable.icon_folder, R.drawable.icon_love, R.drawable.icon_music, R.drawable.icon_people, R.drawable.icon_playlist, R.drawable.icon_top, R.drawable.icon_upload, R.drawable.icon_category};
    View view;

    public NgheSiFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_nghesi, container, false);

        initView();
        initAction();
        return view;

    }

    private void initView() {
        lv_nghesi = (ListView) view.findViewById(R.id.lv_nghesi);

        lv_nghesi.setAdapter(new NgheSiAdapter(getActivity(), prgmNameList, prgmImages));

    }

    private void initAction() {

    }
}
