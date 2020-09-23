package assignment1.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AILifecycle", "The app is started");
        TextView theTextView = (TextView) findViewById(R.id.textView4);
        theTextView.setText("onStart excuted");
        Toast.makeText(Activity1.this,"AIOnStart", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AILifecycle", "The app is stoped");
        TextView theTextView = (TextView) findViewById(R.id.textView4);
        theTextView.setText("onStop executed");
        Toast.makeText(Activity1.this,"AIOnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AILifecycle", "The app is destroyed");
        TextView theTextView = (TextView) findViewById(R.id.textView4);
        theTextView.setText("onDestroy executed");
        Toast.makeText(Activity1.this,"AIOnDestroy", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("AILifecycle", "The app is created");

        setContentView(R.layout.activity_1);

        TextView theTextView = (TextView) findViewById(R.id.textView3);
        theTextView.setText("onCreate excuted");
        Toast.makeText(Activity1.this,"AIOnCreate", Toast.LENGTH_SHORT).show();
    }
}