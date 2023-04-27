package com.example.otpgenrator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RadioButton btn4,btn6,btn8;
    private LinearLayout mainContainer;
    private ArrayList<Integer> edtText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setUpListener();

    }

    private void initView(){

        btn4=findViewById(R.id.btn4);
        btn6=findViewById(R.id.btn6);
        btn8=findViewById(R.id.btn8);



    }

    private void setUpListener(){
        btn4.setOnClickListener(new BtnSetOnClickListener(4));
       btn6.setOnClickListener( new BtnSetOnClickListener(6));
        btn8.setOnClickListener(new BtnSetOnClickListener(8));

    }

    class BtnSetOnClickListener implements View.OnClickListener {

        int count = 0;

        BtnSetOnClickListener(int count) {
            this.count = count;

        }


        @Override
        public void onClick(View view) {


            for (int i = 0; i < count; i++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );

                EditText edt = new EditText(MainActivity.this);
                edt.setLayoutParams(layoutParams);
                edt.setHint("_");
                edt.setInputType(InputType.TYPE_CLASS_NUMBER);
                edt.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20f);
                edt.setGravity(Gravity.CENTER);
              //  edt.setFilter = InputFilter.LengthFilter(1);
                mainContainer.addView(edt);

                int count = 0;




                }

            }
        }


    }


