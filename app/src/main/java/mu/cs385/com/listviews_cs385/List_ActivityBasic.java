package mu.cs385.com.listviews_cs385;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List_ActivityBasic extends AppCompatActivity {

    String[] cheeses = {
            "Parmesan",
            "Ricotta",
            "Fontina",
            "Mozzarella",
            "Cheddar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__basic);


        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                cheeses);

        ListView listView = (ListView) findViewById(R.id.list1);

        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        List_ActivityBasic.this,
                        ""+ cheeses[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
