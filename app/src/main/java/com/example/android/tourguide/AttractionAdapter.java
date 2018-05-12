package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /** Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        /** Get the {@link Attraction} object located at this position in the list */
        Attraction currentAttraction = getItem(position);

        /** Find the TextView in the list_item.xml layout with the ID attraction_title_text_view */
        TextView attractionTitleTextView = (TextView) listItemView.findViewById(R.id.attraction_title_text_view);
        /** Get the name/title from the current Attraction object and
         * set this text on the AttractionName TextView
         */
        attractionTitleTextView.setText(currentAttraction.getAttractionName());

        /** Find the TextView in the list_item.xml layout with the ID attraction_description_text_view */
        TextView attractionDescriptionTextView = (TextView) listItemView.findViewById(R.id.attraction_description_text_view);
        /** Get the attraction description from the current Attraction object and
         * set this text on the description TextView
         */
        attractionDescriptionTextView.setText(currentAttraction.getAttractionDescription());

        /** Find the TextView in the list_item.xml layout with the ID attraction_address_text_view */
        TextView attractionAddressTextView = (TextView) listItemView.findViewById(R.id.attraction_address_text_view);
        /** Get the attraction address from the current Attraction object and
         * set this text on the description TextView
         */
        attractionAddressTextView.setText(currentAttraction.getAttractionAddress());

        /** Find the TextView in the list_item.xml layout with the ID attraction_phone_text_view */
        TextView attractionPhoneTextView = (TextView) listItemView.findViewById(R.id.attraction_phone_text_view);
        /** Get the attraction contact number from the current Attraction object and
         * set this text on the description TextView
         */
        attractionPhoneTextView.setText(currentAttraction.getAttractionPhone());

        /** Find the TextView in the list_item.xml layout with the ID attraction_hours_text_view */
        TextView attractionHoursTextView = (TextView) listItemView.findViewById(R.id.attraction_hours_text_view);
        /** Get the attraction operating hours from the current Attraction object and
         * set this text on the description TextView
         */
        attractionHoursTextView.setText(currentAttraction.getAttractionHours());

        /** Find the ImageView in the list_item.xml layout with the ID attraction_image_view */
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.attraction_image_view);
        /** If there is no image provided, set the icon launcher to the ImageView */
        if (!currentAttraction.hasImage()) {
//            itemImageView.setVisibility(View.GONE);
//            Log.v("AttractionAdapter", "POS: " + position + " - ImageResourceID = " + currentAttraction.getAttractionImageResourceID());
            itemImageView.setImageResource(R.mipmap.ic_launcher);
        } else {
//            Log.v("AttractionAdapter", "POS: " + position + " - ImageResourceID = " + currentAttraction.getAttractionImageResourceID());
            /** Get the image resource ID from the current Attraction object and
             * set this image ID as a resource to the ImageView
             */
            itemImageView.setImageResource(currentAttraction.getAttractionImageResourceID());
            /** Set the view as VISIBLE again because the views are getting recycled and
             * might be invisible from a previous Word object */
            itemImageView.setVisibility(View.VISIBLE);
        }

        /** Find the TextView in the list_item.xml layout with the ID attraction_other_text_edit */
        TextView attractionOtherTextView = (TextView) listItemView.findViewById(R.id.attraction_other_text_edit);
        /** Remove this view until there is an adapter and Attraction objects that will have extra info to be displayed here */
        attractionOtherTextView.setVisibility(View.GONE);
        /** Find the LinearLayout of the text (both translated and original) with the ID text_container */
        //LinearLayout linearLayoutForText = (LinearLayout) listItemView.findViewById(R.id.text_container);
        /** Set the background color of the container */
        //linearLayoutForText.setBackgroundColor(mColorResourceId);
        return listItemView;
    }
}
