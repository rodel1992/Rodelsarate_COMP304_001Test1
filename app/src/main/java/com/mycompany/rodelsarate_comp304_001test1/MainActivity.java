package com.mycompany.rodelsarate_comp304_001test1;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.contactGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                RadioButton rodelButton = (RadioButton) findViewById(R.id.rodel);
                if(rodelButton.isChecked()){
                    message("rodel", rodelButton);
                }
                RadioButton sarahButton = (RadioButton) findViewById(R.id.sarah);
                if(sarahButton.isChecked()){
                    message("sarah", sarahButton);
                }
                RadioButton luciaButton = (RadioButton) findViewById(R.id.lucia);
                if(luciaButton.isChecked()){
                    message("lucia", luciaButton);
                }
                RadioButton rucilleButton = (RadioButton) findViewById(R.id.rucille);
                if(rucilleButton.isChecked()){
                    message("rucille", rucilleButton);
                }
                RadioButton rodulfoButton = (RadioButton) findViewById(R.id.rodulfo);
                if(rodulfoButton.isChecked()){
                    message("rodulfo", rodulfoButton);
                }
                RadioButton jerryButton = (RadioButton) findViewById(R.id.jerry);
                if(jerryButton.isChecked()){
                    message("jerry", jerryButton);
                }
            }
        });
    }

    public void message(String name, RadioButton rButton){
        Intent intent = new Intent(this, MessagingActivity.class);
        intent.putExtra("name", rButton.getText());
        startActivity(intent);
    }
}
