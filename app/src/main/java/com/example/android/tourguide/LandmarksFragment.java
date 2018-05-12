package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        final ArrayList<Attraction> landmarkAttractions = new ArrayList<Attraction>();
        landmarkAttractions.add(new Attraction(getString(R.string.land_wht_title), getString(R.string.land_wht_description), getString(R.string.land_wht_address), getString(R.string.land_wht_hours), getString(R.string.land_wht_phone), R.drawable.whitetower));
        landmarkAttractions.add(new Attraction(getString(R.string.land_gal_title), getString(R.string.land_gal_description), getString(R.string.land_gal_address), getString(R.string.land_gal_hours), getString(R.string.land_gal_phone), R.drawable.galerius));
        landmarkAttractions.add(new Attraction(getString(R.string.land_rom_title), getString(R.string.land_rom_description), getString(R.string.land_rom_address), getString(R.string.land_rom_hours), getString(R.string.land_rom_phone), R.drawable.romanforum));
        landmarkAttractions.add(new Attraction(getString(R.string.land_hep_title), getString(R.string.land_hep_description), getString(R.string.land_hep_address), getString(R.string.land_hep_hours), getString(R.string.land_hep_phone), R.drawable.heptapyrgion));
        landmarkAttractions.add(new Attraction(getString(R.string.land_ham_title), getString(R.string.land_ham_description), getString(R.string.land_ham_address), getString(R.string.land_ham_hours), getString(R.string.land_ham_phone), R.drawable.beyhamam));
        landmarkAttractions.add(new Attraction(getString(R.string.land_ote_title), getString(R.string.land_ote_description), getString(R.string.land_ote_address), getString(R.string.land_ote_hours), getString(R.string.land_ote_phone), R.drawable.otetower));
        landmarkAttractions.add(new Attraction(getString(R.string.land_alx_title), getString(R.string.land_alx_description), getString(R.string.land_alx_address), getString(R.string.land_alx_hours), getString(R.string.land_alx_phone), R.drawable.alexgreat));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        AttractionAdapter landmarks = new AttractionAdapter(getActivity(), landmarkAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(landmarks);

        return rootView;
    }

}
