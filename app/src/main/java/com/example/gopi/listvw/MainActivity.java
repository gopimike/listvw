package com.example.gopi.listvw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<String> arrayList;
ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lstvw);

        arrayList=new ArrayList<>();
        arrayList.add("gopi");
        arrayList.add("gopii");
        arrayList.add("gopiii");
        arrayList.add("gopiiii");
        arrayList.add("gopiiiii");
        arrayList.add("gopiiiiii");

arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, "Item clicked", Toast.LENGTH_SHORT).show();
    }
});
    }
}
