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
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        final ArrayList<Attraction> museumAttractions = new ArrayList<Attraction>();
        museumAttractions.add(new Attraction(getString(R.string.mus_archmus_title), getString(R.string.mus_archmus_description), getString(R.string.mus_archmus_address), getString(R.string.mus_archmus_hours), getString(R.string.mus_archmus_phone), R.drawable.archmusthes));
        museumAttractions.add(new Attraction(getString(R.string.mus_byzcult_title), getString(R.string.mus_byzcult_description), getString(R.string.mus_byzcult_address), getString(R.string.mus_byzcult_hours), getString(R.string.mus_byzcult_phone), R.drawable.musbyzcult));
        museumAttractions.add(new Attraction(getString(R.string.mus_ataturk_title), getString(R.string.mus_ataturk_description), getString(R.string.mus_ataturk_address), getString(R.string.mus_ataturk_hours), getString(R.string.mus_ataturk_phone), R.drawable.ataturkmus));
        museumAttractions.add(new Attraction(getString(R.string.mus_jewish_title), getString(R.string.mus_jewish_description), getString(R.string.mus_jewish_address), getString(R.string.mus_jewish_hours), getString(R.string.mus_jewish_phone), R.drawable.jewishmus));
        museumAttractions.add(new Attraction(getString(R.string.mus_maccontart_title), getString(R.string.mus_maccontart_description), getString(R.string.mus_maccontart_address), getString(R.string.mus_maccontart_hours), getString(R.string.mus_maccontart_phone), R.drawable.muscontart));
        museumAttractions.add(new Attraction(getString(R.string.mus_photogr_title), getString(R.string.mus_photogr_description), getString(R.string.mus_photogr_address), getString(R.string.mus_photogr_hours), getString(R.string.mus_photogr_phone), R.drawable.musphotogr));
        museumAttractions.add(new Attraction(getString(R.string.mus_macstrug_title), getString(R.string.mus_macstrug_description), getString(R.string.mus_macstrug_address), getString(R.string.mus_macstrug_hours), getString(R.string.mus_macstrug_phone), R.drawable.musmacstruggle));
        museumAttractions.add(new Attraction(getString(R.string.mus_statecontart_title), getString(R.string.mus_statecontart_description), getString(R.string.mus_statecontart_address), getString(R.string.mus_statecontart_hours), getString(R.string.mus_statecontart_phone), R.drawable.statemuscontart));
        museumAttractions.add(new Attraction(getString(R.string.mus_folkart_title), getString(R.string.mus_folkart_description), getString(R.string.mus_folkart_address), getString(R.string.mus_folkart_hours), getString(R.string.mus_folkart_phone), R.drawable.folkartmus));
        museumAttractions.add(new Attraction(getString(R.string.mus_olympic_title), getString(R.string.mus_olympic_description), getString(R.string.mus_olympic_address), getString(R.string.mus_olympic_hours), getString(R.string.mus_olympic_phone), R.drawable.olympicmus));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        AttractionAdapter museums = new AttractionAdapter(getActivity(), museumAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(museums);

        return rootView;
    }

}
