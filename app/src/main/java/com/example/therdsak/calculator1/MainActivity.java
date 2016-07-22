package com.example.therdsak.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public String str = "";
    Character op = 'q';
    int  num, numtemp;
    TextView showResult;
//    private ButtonClickListener btnClick;
////    private String textNumber;


//    public Button[] buttons;
//    public int[] buttonNumbers = {
//            R.id.Buttonnumber00,
//            R.id.Buttonnumber01,
//            R.id.Buttonnumber02,
//            R.id.Buttonnumber03,
//            R.id.Buttonnumber04,
//            R.id.Buttonnumber05,
//            R.id.Buttonnumber06,
//            R.id.Buttonnumber07,
//            R.id.Buttonnumber08,
//            R.id.Buttonnumber09,
//
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (TextView) findViewById(R.id.label);}
//    public Button[] buttons;
//    public int[] buttonNumbers = {
//           R.id.Buttonnumber00,
//            R.id.Buttonnumber01,
//            R.id.Buttonnumber02,
//            R.id.Buttonnumber03,
//            R.id.Buttonnumber04,
//            R.id.Buttonnumber05,
//            R.id.Buttonnumber06,
//            R.id.Buttonnumber07,
//            R.id.Buttonnumber08,
//            R.id.Buttonnumber09,
//
//    };
//    for(int id:Button)
//    {
//        View v = (View) findViewById(id);
//        v.setOnClickListener(btnClick);}


//        int buttonNumSize = buttonNumbers.length;
//        buttons = new Button[buttonNumSize];
//        for (int i = 0; i < buttonNumSize; i++) {
//            buttons[i] = (Button) findViewById(buttonNumbers[i]);
//            buttons[i].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Button btnNumber = (Button) view;
//                    String textNumber = (String) btnNumber.getText();
//
//                }
//            });
//        }
//    }
//}

    public void ButtonClickHandler1 (View v)
    {
        insert(1);
    }
    public void ButtonClickHandler2 (View v) {
        insert(2);
    }
    public void ButtonClickHandler3 (View v) {
        insert(3);
    }
    public void ButtonClickHandler4 (View v) {
        insert(4);
    }
    public void ButtonClickHandler5 (View v) {
        insert(5);
    }
    public void ButtonClickHandler6 (View v) {
        insert(6);
    }
    public void ButtonClickHandler7 (View v) {
        insert(7);
    }
    public void ButtonClickHandler8 (View v) {
        insert(8);
    }
    public void ButtonClickHandler9 (View v) {
        insert(9);
    }
    public void ButtonClickHandler0 (View v) {
        insert(0);
    }
    public void ButtonClickHandlerAdd (View v){
        perform();
        op = '+';

    }
    public void ButtonClickHandlerSub (View v) {
        perform();
        op = '-';
    }
    public void ButtonClickHandlerMul (View v) {
        perform();
        op = '*';
    }
    public void ButtonClickHandlerDiv (View v) {
        perform();
        op = '/';
    }
    public void ButtonClickHandlerCal (View v) {
        calculate();
    }
    public void ButtonClickHandlerreset (View v) {
        reset();
    }
    private void reset() {

        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }



    private void insert(int j) {

        str = str + Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }
    private void perform() {
        str = "";
        numtemp = num;
    }
    private void calculate() {
        if(op == '+')
            num = numtemp+num;
        else if(op == '-')
            num = numtemp-num;
        else if(op == '/')
            num = numtemp/num;
        else if(op == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }
}







