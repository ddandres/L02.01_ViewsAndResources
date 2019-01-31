/*
 * Copyright (c) 2016. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l02_01_viewsandresources;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the activity content from a layout resource
        setContentView(R.layout.activity_main);

        // Get a reference to a View (TextView) from the activity content
        TextView tv = findViewById(R.id.tvRuntimeId);
        // Change its properties at runtime: resource ID as parameter
        tv.setText(R.string.going_on);

        // Get a reference to a View (TextView) from the activity content
        tv = findViewById(R.id.tvRuntimeString);
        // Change its properties at runtime: String as parameter
        final String newText = getResources().getString(R.string.anything_new);
        tv.setText(newText);
    }
}
