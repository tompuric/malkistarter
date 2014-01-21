package malic.com.example.tutorial_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        // Malki's Comment
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test, menu);
        // tes
        // Hello
        
        return true;
    }
    
}
