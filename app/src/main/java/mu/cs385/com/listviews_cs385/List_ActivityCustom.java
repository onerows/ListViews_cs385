package mu.cs385.com.listviews_cs385;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class List_ActivityCustom extends AppCompatActivity {

    GridView gridView;

    static final String[] MOBILE_OS = new String[] { "Android", "iOS",
            "Windows", "Blackberry" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__custom);

        gridView = (GridView) findViewById(R.id.mobileview1);
        gridView.setAdapter(new ImageAdapter(this, MOBILE_OS));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //The parameters to the onItemClick are the Adapter we are using for gridView(parent)
            //the Layout(v) we click on, the position in the list we click(position),
            //and an integer id
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                //In the toast we use the position clicked in the list and
                //the text view from the layout we click on grid_item_label
                Toast.makeText(
                        List_ActivityCustom.this,
                        ((TextView) v.findViewById(R.id.grid_item_label))
                                .getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
