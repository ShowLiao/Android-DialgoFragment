package com.example.show.simpledialogfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showEditDialog();


    }

    private void showEditDialog() {
        FragmentManager fm = getSupportFragmentManager();
        EditDialogFragment fragment = EditDialogFragment.newInstance("Todo Edit");
        fragment.show(fm, "activity_edit_dialog_fragment");

    }



}
