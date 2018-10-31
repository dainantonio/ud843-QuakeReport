/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_earthquake_list_view);

        // Create a fake list of earthquake objects
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("6.0","San Francisco","October 26, 2018"));
        earthquakes.add(new Earthquake("7.0","London","January 1, 2018"));
        earthquakes.add(new Earthquake("2.5","Tokyo","February 26, 2018"));
        earthquakes.add(new Earthquake("5.7","Mexico City","October 26, 2018"));
        earthquakes.add(new Earthquake("1.6","Moscow","October 30, 2005"));
        earthquakes.add(new Earthquake("4.6","Rio de Janiero","November 3, 2018"));
        earthquakes.add(new Earthquake("8.0","Paris","June 26, 2020"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
       EarthquakeAdapter adapter =new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
