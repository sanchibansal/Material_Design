package com.example.sakshi.material_design;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    FloatingActionButton fab;
    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList<String> list; //Declaring toolbar, fab, recyclerview, adapter and arraylist

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //associating toolbar, fab, recyclerview and list
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        fab = (FloatingActionButton)findViewById(R.id.fab);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        list = new ArrayList<>();

        //setting on click listener for floating action button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Floating Action Button Clicked.", Toast.LENGTH_SHORT).show();
            }
        });
        //getting support of actionbar
        setSupportActionBar(toolbar);
        //creating array for the different versions of android
        String version[]= new String[]{"Alpha","Beta","Cupcake","Donut","Eclairs","Froyo","Gingerbread","Honeycomb","Icrecream Sandwich","Jellybean","Kitkat","Lollipop","Marshmallow","Nougat","Oreo"};
        //setting layout manager to recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        //adding elements of array to arraylist
        for(int i=0;i<version.length;i++){
            list.add(version[i]);
        }
        //calling constructor of MyAdapter
        adapter = new MyAdapter(MainActivity.this,list);
        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);


    }

    @Override
    //creating options menu
    public boolean onCreateOptionsMenu(Menu menu) {
        //cfreating object for menuinflator
        MenuInflater menuInflater = getMenuInflater();
        //inflating menu from the menu directory
        menuInflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    //on item click listener for the options menu
    public boolean onOptionsItemSelected(MenuItem item) {
        //getting item selected id
        int id = item.getItemId();
        if(id==R.id.search){
            //executes  if id is equal to that for search
            Toast.makeText(this, "Search clicked.", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.settings){
            //executes if id is equal to that for settings
            Toast.makeText(this, "Settings clicked.", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.add){
            //executes if the id is equal to that for add
            Toast.makeText(this, "Add clicked", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.delete){
            //executes if id is equal to that for delete
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
