package com.example.calculator_two_lines_video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.xml.transform.Result;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    private EditText myText;
    String Line_1 ="", Line_2 = "Hello students";
    public boolean flag_plus = false;
    public boolean flag_minus = false;
    public boolean flag_mulp = false;
    public boolean flag_divide = false;

    String Tag = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (EditText)findViewById(R.id.myTextField);
    }
    public void click_0(View view){
        Line_1= Line_1 + "0";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_1(View view) {
        Line_1 = Line_1 + "1";
        myText.setText(Line_2 + "\n" + Line_1);
    }
    public void click_2(View view){
        Line_1= Line_1 + "2";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_3(View view){
        Line_1= Line_1 + "3";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_4(View view){
        Line_1= Line_1 + "4";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_5(View view){
        Line_1= Line_1 + "5";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_6(View view){
        Line_1= Line_1 + "6";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_7(View view){
        Line_1= Line_1 + "7";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_8(View view){
        Line_1= Line_1 + "8";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_9(View view){
        Line_1= Line_1 + "9";
        myText.setText(Line_2+"\n"+Line_1);
    }



    public void click_clear(View view){
        Line_1="";
        Line_2="";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_dot(View view) {
        String myText_string = myText.getText().toString();
        if (!Line_1.contains(".")) {
            Line_1 = Line_1 +".";
            //만약 .이있으면 점찍어도 skip해라
        }
        myText.setText(myText.getText() + ".");
    }
    public void click_pm(View view){
        if(!Line_1.contains("-")){
            Line_1 ="-"+Line_1;
        }
        else{
            Line_1 = Line_1.substring(1);
        }
        myText.setText(Line_2+"\n"+Line_1);
    }

    public void click_delete(View view){
        if(Line_1.length() != 0){
            Line_1 =Line_1.substring(0, Line_1.length()-1);
        }

        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_sum(View view){
        flag_plus = true;
        flag_minus = false;
        flag_mulp = false;
        flag_divide = false;

        Tag = Line_1;

        Line_1 ="";
        Line_2 =Tag +"+";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_multi(View view){
        flag_plus = false;
        flag_minus = false;
        flag_mulp = true;
        flag_divide = false;

        Tag = Line_1;

        Line_1 ="";
        Line_2 =Tag +"*";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_div(View view){
        flag_plus = false;
        flag_minus = false;
        flag_mulp = false;
        flag_divide = true;

        Tag = Line_1;

        Line_1 ="";
        Line_2 =Tag +"/";
        myText.setText(Line_2+"\n"+Line_1);
    }

    public void click_min(View view){
        flag_plus = false;
        flag_minus = true;
        flag_mulp = false;
        flag_divide = false;

        Tag = Line_1;

        Line_1 ="";
        Line_2 =Tag +"-";
        myText.setText(Line_2+"\n"+Line_1);
    }
    public void click_equal(View view){
        float Number_1_float = Float.parseFloat(Tag);
        float Number_2_float = Float.parseFloat(Line_1);
        float result;
        if(flag_plus){
            result =Number_1_float +  Number_2_float;
            Line_2 =Line_2+Line_1+"=";
            Line_1 = String.valueOf(result) ;
            myText.setText(Line_2+"\n"+Line_1);
        }
        else if(flag_minus){
            result = Number_1_float - Number_2_float;
            Line_2 =Line_2+Line_1+"=";
            Line_1 = String.valueOf(result) ;
            myText.setText(Line_2+"\n"+Line_1);
        }
        else if(flag_mulp){
            result = Number_1_float * Number_2_float;
            Line_2 =Line_2+Line_1+"=";
            Line_1 = String.valueOf(result) ;
            myText.setText(Line_2+"\n"+Line_1);
        }
        else if(flag_divide){
            result= Number_1_float / Number_2_float;
            Line_2 =Line_2+Line_1+"=";
            Line_1 = String.valueOf(result) ;
            myText.setText(Line_2+"\n"+Line_1);
        }


    }
    public void click_square(View view){
        float x ,result;

        if(Line_1.length() !=0)
        {
            x = Float.parseFloat(Line_1);
            result = (float) Math.pow(x,2.0);
            Line_2 = valueOf(x) + "^2 ="+ valueOf(result);
            Line_1 ="";
            myText.setText(Line_2+"\n"+Line_1);

        }


    }

}