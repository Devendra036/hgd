package com.example.expt8;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    RadioButton radioButton;
    RadioGroup radioGroup;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radiogroup);
        textView=findViewById(R.id.textView3);
        Button b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(r);
                textView.setText("Your choice is "+radioButton.getText());
            }
        });
    }
    public void checkButton(View v){
        int r=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(r);
        Toast.makeText(this,"Selected radio button: "+radioButton.getText(),Toast.LENGTH_SHORT).show();

    }
}