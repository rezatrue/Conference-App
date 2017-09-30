package android.reza.com.conference_app;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements View.OnTouchListener{
    ConstraintLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_layout = (ConstraintLayout)findViewById(R.id.main_layout);
        main_layout.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Intent intent = new Intent(this,MainMenuActivity.class);
        startActivity(intent);
        return false;
    }
}
