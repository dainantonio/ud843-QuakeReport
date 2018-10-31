package com.example.android.quakereport;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView  = convertView;
        if (listItemView == null) {
            //The inflater is used to map the instance variables to the TextView in the
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.display_view, parent, false);
        }



        //The different objects at each position located by each of their Id's

        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        TextView locationView = listItemView.findViewById(R.id.location);
        TextView dateView = listItemView.findViewById(R.id.date);

        // get object located at the position
        Earthquake currentEarthquake= getItem(position);



        magnitudeView.setText(currentEarthquake.getQuakeMagnitude());
        locationView.setText(currentEarthquake.getQuakeLocation());
        dateView.setText(currentEarthquake.getQuakeDate());

        return listItemView;
    }
}