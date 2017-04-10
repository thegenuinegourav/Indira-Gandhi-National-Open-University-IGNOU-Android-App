package thegenuinegourav.ignou.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import thegenuinegourav.ignou.R;


public class Module1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("");
        toolbar.setSubtitle("");
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText("Module 1");
        ImageButton back = (ImageButton) toolbar.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void switchToContent(String heading) {
        Intent i =new Intent(Module1Activity.this,ContentActivity.class);
        i.putExtra("Module",heading);
        startActivity(i);
    }

    public void module1a(View view) {
        switchToContent(((TextView) findViewById(R.id.module1_heading)).getText().toString());
    }

    public void module1b(View view) {
        switchToContent(((TextView) findViewById(R.id.module2_heading)).getText().toString());
    }

    public void module1c(View view) {
        switchToContent(((TextView) findViewById(R.id.module3_heading)).getText().toString());
    }

    public void module1d(View view) {
        switchToContent(((TextView) findViewById(R.id.module4_heading)).getText().toString());
    }

    public void module1e(View view) {
        switchToContent(((TextView) findViewById(R.id.module5_heading)).getText().toString());
    }

    public void module1f(View view) {
        switchToContent(((TextView) findViewById(R.id.module6_heading)).getText().toString());
    }
}
