package com.example.cdurif.myjapan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MediaDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //display the arrow to return home
        //getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle = getIntent().getExtras();
        Toast.makeText(this, bundle.getString("TITLE"), Toast.LENGTH_LONG).show();

        TextView name = (TextView)findViewById(R.id.med_det_name);
        name.setText(bundle.getString("TITLE"));

        ImageView i = (ImageView)findViewById(R.id.med_det_img);
        i.setImageResource(bundle.getInt("IMG"));

        TextView desc = (TextView)findViewById(R.id.med_det_desc);
        desc.setText(bundle.getString("DESC"));

        TextView year = (TextView)findViewById(R.id.med_det_year);
        year.setText("" + bundle.getInt("YEAR"));

        TextView longDesc = (TextView)findViewById(R.id.med_long_desc);
        longDesc.setText(bundle.getString("LONG"));

    }



    /*
    Configuration of the arrow in the ActionBar
    Same action than the back button by using onBackPressed()
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
