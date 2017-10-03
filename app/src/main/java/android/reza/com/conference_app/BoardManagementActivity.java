package android.reza.com.conference_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class BoardManagementActivity extends AppCompatActivity {
    Person person;
    ArrayList<Person> managementPeople;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_management);
        person = new Person();



    }
}
