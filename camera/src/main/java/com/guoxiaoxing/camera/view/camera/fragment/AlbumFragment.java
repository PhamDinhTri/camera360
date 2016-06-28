package com.guoxiaoxing.camera.view.camera.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.github.skykai.stickercamera.R;
import com.guoxiaoxing.camera.view.camera.CameraManager;
import com.guoxiaoxing.camera.view.camera.adapter.GalleryAdapter;
import com.guoxiaoxing.camera.view.model.PhotoItem;

import java.util.ArrayList;

/**
 * @author tongqian.ni
 */
public class AlbumFragment extends Fragment {
    private ArrayList<PhotoItem> photos = new ArrayList<PhotoItem>();
    private GridView albums;

    public AlbumFragment() {
        super();
    }

    public static Fragment newInstance(ArrayList<PhotoItem> photos) {
        Fragment fragment = new AlbumFragment();
        Bundle args = new Bundle();
        args.putSerializable("photos", photos);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_album, null);
        photos = (ArrayList<PhotoItem>) getArguments().getSerializable("photos");
        albums = (GridView) root.findViewById(R.id.albums);
        albums.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                PhotoItem photo = photos.get(arg2);
                CameraManager.getInst().processPhotoItem(getActivity(), photo);
            }
        });
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        albums.setAdapter(new GalleryAdapter(getActivity(), photos));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
