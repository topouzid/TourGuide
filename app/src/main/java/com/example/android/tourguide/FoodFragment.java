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
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        final ArrayList<Attraction> foodAttractions = new ArrayList<Attraction>();
        foodAttractions.add(new Attraction(getString(R.string.food_tsi_title), getString(R.string.food_tsi_description), getString(R.string.food_tsi_address), getString(R.string.food_tsi_hours), getString(R.string.food_tsi_phone), R.drawable.tsinari));
        foodAttractions.add(new Attraction(getString(R.string.food_clo_title), getString(R.string.food_clo_description), getString(R.string.food_clo_address), getString(R.string.food_clo_hours), getString(R.string.food_clo_phone), R.drawable.clochard));
        foodAttractions.add(new Attraction(getString(R.string.food_kou_title), getString(R.string.food_kou_description), getString(R.string.food_kou_address), getString(R.string.food_kou_hours), getString(R.string.food_kou_phone), R.drawable.koukos));
        foodAttractions.add(new Attraction(getString(R.string.food_pry_title), getString(R.string.food_pry_description), getString(R.string.food_pry_address), getString(R.string.food_pry_hours), getString(R.string.food_pry_phone), R.drawable.prytaneio));
        foodAttractions.add(new Attraction(getString(R.string.food_ops_title), getString(R.string.food_ops_description), getString(R.string.food_ops_address), getString(R.string.food_ops_hours), getString(R.string.food_ops_phone), R.drawable.opsopoion));
        foodAttractions.add(new Attraction(getString(R.string.food_mar_title), getString(R.string.food_mar_description), getString(R.string.food_mar_address), getString(R.string.food_mar_hours), getString(R.string.food_mar_phone), R.drawable.marea));
        foodAttractions.add(new Attraction(getString(R.string.food_roo_title), getString(R.string.food_roo_description), getString(R.string.food_roo_address), getString(R.string.food_roo_hours), getString(R.string.food_roo_phone), R.drawable.roots));
        foodAttractions.add(new Attraction(getString(R.string.food_fol_title), getString(R.string.food_fol_description), getString(R.string.food_fol_address), getString(R.string.food_fol_hours), getString(R.string.food_fol_phone), R.drawable.neafolia));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        AttractionAdapter food = new AttractionAdapter(getActivity(), foodAttractions);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(food);

        return rootView;
    }

}
