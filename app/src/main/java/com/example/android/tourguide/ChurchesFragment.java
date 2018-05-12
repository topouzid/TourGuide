package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChurchesFragment extends Fragment {

    public ChurchesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        final ArrayList<Attraction> churchAttractions = new ArrayList<Attraction>();
        churchAttractions.add(new Attraction(getResources().getString(R.string.ch_rotonda_title), getString(R.string.ch_rotonda_description), getString(R.string.ch_rotonda_address), getString(R.string.ch_rotonda_hours), getString(R.string.ch_rotonda_phone), R.drawable.rotunda));
        churchAttractions.add(new Attraction(getString(R.string.ch_sop_title), getString(R.string.ch_sop_description), getString(R.string.ch_sop_address), getString(R.string.ch_sop_hours), getString(R.string.ch_sop_phone), R.drawable.hagiasophia));
        churchAttractions.add(new Attraction(getString(R.string.ch_dem_title), getString(R.string.ch_dem_description), getString(R.string.ch_dem_address), getString(R.string.ch_dem_hours), getString(R.string.ch_dem_phone), R.drawable.hagiosdemetrios));
        churchAttractions.add(new Attraction(getString(R.string.ch_chalk_title), getString(R.string.ch_chalk_description), getString(R.string.ch_chalk_address), getString(R.string.ch_chalk_hours), getString(R.string.ch_chalk_phone), R.drawable.panagiachalkeon));
        churchAttractions.add(new Attraction(getString(R.string.ch_dav_title), getString(R.string.ch_dav_description), getString(R.string.ch_dav_address), getString(R.string.ch_dav_hours), getString(R.string.ch_dav_phone), R.drawable.hosiosdavidinside));
        churchAttractions.add(new Attraction(getString(R.string.ch_nic_title), getString(R.string.ch_nic_description), getString(R.string.ch_nic_address), getString(R.string.ch_nic_hours), getString(R.string.ch_nic_phone)));
        churchAttractions.add(new Attraction(getString(R.string.ch_eli_title), getString(R.string.ch_eli_description), getString(R.string.ch_eli_address), getString(R.string.ch_eli_hours), getString(R.string.ch_eli_phone), R.drawable.elijah));
        churchAttractions.add(new Attraction(getString(R.string.ch_vla_title), getString(R.string.ch_vla_description), getString(R.string.ch_vla_address), getString(R.string.ch_vla_hours), getString(R.string.ch_vla_phone), R.drawable.vlatadon));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        AttractionAdapter churches = new AttractionAdapter(getActivity(), churchAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(churches);

        return rootView;
    }

}
