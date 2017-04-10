package thegenuinegourav.ignou.activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import thegenuinegourav.ignou.R;

import static thegenuinegourav.ignou.R.id.back;
import static thegenuinegourav.ignou.R.id.default_activity_button;

public class ContentActivity extends AppCompatActivity {


    int choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setTitle("");
        toolbar.setSubtitle("");

        String heading = getIntent().getExtras().getString("Module");

        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText(heading);
        ImageButton back = (ImageButton) toolbar.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        choice = 1;
        updateUIWith(choice);
    }

    void updateContentWith(int pos) {
        //TODO Change Content accordingly
    }

    void updateUIWith(int pos)
    {
        switch (pos)
        {
            case 1: ((ImageButton) findViewById(R.id.pos_1)).setBackgroundColor(Color.WHITE);
                ((ImageButton) findViewById(R.id.pos_2)).setBackgroundColor(Color.TRANSPARENT);
                ((ImageButton) findViewById(R.id.pos_3)).setBackgroundColor(Color.TRANSPARENT);
                break;
            case 2: ((ImageButton) findViewById(R.id.pos_1)).setBackgroundColor(Color.TRANSPARENT);
                ((ImageButton) findViewById(R.id.pos_2)).setBackgroundColor(Color.WHITE);
                ((ImageButton) findViewById(R.id.pos_3)).setBackgroundColor(Color.TRANSPARENT);
                break;
            case 3: ((ImageButton) findViewById(R.id.pos_1)).setBackgroundColor(Color.TRANSPARENT);
                ((ImageButton) findViewById(R.id.pos_2)).setBackgroundColor(Color.TRANSPARENT);
                ((ImageButton) findViewById(R.id.pos_3)).setBackgroundColor(Color.WHITE);
                break;
        }
        updateContentWith(pos);

    }

    public void Continue(View view) {
        switch (choice)
        {
            case 1: choice = 2;
                break;
            case 2: choice = 3;
                break;
            case 3: finish();
                break;
        }
        updateUIWith(choice);
    }

    public void pos_3(View view) {
        updateUIWith(3);
        choice = 3;
    }

    public void pos_2(View view) {
        updateUIWith(2);
        choice = 2;
    }

    public void pos_1(View view) {
        updateUIWith(1);
        choice = 1;
    }
}
