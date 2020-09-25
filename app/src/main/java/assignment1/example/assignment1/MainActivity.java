package assignment1.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainLifecycle", "The app is started");
        TextView theTextView = (TextView) findViewById(R.id.textView2);
        theTextView.setText("onStart excuted");

        Toast.makeText(MainActivity.this,"MainOnStart", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainLifecycle", "The app is stoped");
        Toast.makeText(MainActivity.this,"MainOnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainLifecycle", "The app is destroyed");
        Toast.makeText(MainActivity.this,"MainOnDestroy", Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainLifecycle", "The app is created");
        setContentView(R.layout.activity_main);


        Toast.makeText(MainActivity.this,"MainOnCreate", Toast.LENGTH_SHORT).show();
        TextView theTextView = (TextView) findViewById(R.id.textView1);
        theTextView.setText("onCreate excuted");

        String[] sports = getResources().getStringArray(R.array.activity);

        listView = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList= new ArrayList<>();



        //Row layout defined by Android: android.R.layout.simple_list_item_1
        listView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, sports));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view.getContext(), Activity1.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(view.getContext(), Activity2.class);
                    startActivity(intent);
                }
            }
        });

    }


}