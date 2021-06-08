package com.haris.commutesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;


public class ShareDriverLocation extends AppCompatActivity {

    private ListView listView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_driver_location);

        this.listView = (ListView)findViewById(R.id.listView);
        this.button = (Button)findViewById(R.id.button);

        // CHOICE_MODE_NONE: (Default)
        // (listView.setItemChecked(..) doest not work with CHOICE_MODE_NONE).
        // CHOICE_MODE_SINGLE:
        // CHOICE_MODE_MULTIPLE:
        // CHOICE_MODE_MULTIPLE_MODAL:
        this.listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CheckedTextView v = (CheckedTextView) view;
                boolean currentCheck = v.isChecked();
                UserAccount user = (UserAccount) listView.getItemAtPosition(position);
                user.setActive(!currentCheck);
            }
        });
        //

        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printSelectedItems();
            }
        });

        this.initListViewData();
    }

    private void initListViewData()  {
        UserAccount tom = new UserAccount("Huda","Student", false);
        UserAccount jerry = new UserAccount("Fatima","Student", false);
        UserAccount donald = new UserAccount("Hadi","Student", false);

        UserAccount[] users = new UserAccount[]{tom,jerry, donald};

        // android.R.layout.simple_list_item_checked:
        // ListItem is very simple (Only one CheckedTextView).
        ArrayAdapter<UserAccount> arrayAdapter
                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_checked , users);

        this.listView.setAdapter(arrayAdapter);

        for(int i=0;i< users.length; i++ )  {
            this.listView.setItemChecked(i,users[i].isActive());
        }
    }

    public void printSelectedItems()  {
        Intent intent = new Intent(ShareDriverLocation.this, DriverLoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Trip Completed", Toast.LENGTH_LONG).show();
    }

}