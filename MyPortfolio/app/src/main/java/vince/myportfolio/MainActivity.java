package vince.myportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize buttons
        buttonClick();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonClick() {

        Button Spotify = (Button) findViewById(R.id.button);
        Button Scores = (Button) findViewById(R.id.button2);
        Button Library = (Button) findViewById(R.id.button3);
        Button Build = (Button) findViewById(R.id.button4);
        Button XYZ = (Button) findViewById(R.id.button5);
        Button Capstone = (Button) findViewById(R.id.button6);

        buttonToast(Spotify,"Opening Spotify App");
        buttonToast(Scores,"Opening Scores App");
        buttonToast(Library,"Opening Library App");
        buttonToast(Build,"Opening Build App");
        buttonToast(XYZ,"Opening XYZ App");
        buttonToast(Capstone,"Opening Capstone App");


    }

    public void buttonToast(Button button, final String toastText){

        button.setOnClickListener(new View.OnClickListener() {

            // Do something in response to button click
            public void onClick (View v){
                // Do something in response to button click
                Context context = getApplicationContext();
                CharSequence text = toastText;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }


}







