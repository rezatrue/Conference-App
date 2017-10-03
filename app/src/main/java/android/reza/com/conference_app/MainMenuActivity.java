package android.reza.com.conference_app;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity{
    private RecyclerView menuRecycleView;
    private MenuAdapter menuAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);

        String[] items = getResources().getStringArray(R.array.menu_items);
        menuRecycleView = (RecyclerView) findViewById(R.id.menuRecycleListView);
        menuAdapter = new MenuAdapter(this,items);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        menuRecycleView.setLayoutManager(llm);
        menuRecycleView.setAdapter(menuAdapter);


    }




}
