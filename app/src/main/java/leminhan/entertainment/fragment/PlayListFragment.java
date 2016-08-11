package leminhan.entertainment.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import leminhan.entertainment.R;
import leminhan.entertainment.adapter.PlayListAdapter;

/**
 * Created by Le Minh An on 8/8/2016.
 */
public class PlayListFragment extends Fragment {
    ImageView iv_add;
    View view;
    EditText et_user_input;
    ListView lv_playlist;
    ArrayList<String> playListModels;
    PlayListAdapter playListAdapter;

    public PlayListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_playlist, container, false);

        initView();
        initAction();
        return view;

    }

    private void initView() {
        iv_add = (ImageView) view.findViewById(R.id.iv_add);
        lv_playlist = (ListView) view.findViewById(R.id.lv_playlist);
        playListModels = new ArrayList<>();
        playListAdapter = new PlayListAdapter(getActivity(), playListModels);
        lv_playlist.setAdapter(playListAdapter);


    }

    private void initAction() {
        iv_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflaterAndroid = LayoutInflater.from(getActivity());
                View mView = layoutInflaterAndroid.inflate(R.layout.dialog_add_playlist, null);
                AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(getActivity());
                alertDialogBuilderUserInput.setView(mView);


                et_user_input = (EditText) mView.findViewById(R.id.et_user_input);
                alertDialogBuilderUserInput
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogBox, int id) {
                                String input = et_user_input.getText().toString();
                                playListModels.add(input);
                                playListAdapter.notifyDataSetChanged();

                            }
                        })


                        .setNegativeButton("Cancel",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialogBox, int id) {
                                        dialogBox.cancel();
                                    }
                                });


                AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();
                alertDialogAndroid.show();

            }
        });


    }

}
