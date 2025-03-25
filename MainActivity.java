package com.example.slip10q2;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);
        String[] fruits = {"Apple", "Banana", "Cherry", "Grapes", "Mango", "Orange", "Pineapple"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, fruits);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this, "Selected: " + fruits[position], Toast.LENGTH_SHORT).show());
    }
}
