package hse.course.changebg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main_activity);
    }

    public void changeBackground(View view) {
        EditText colourInputField = findViewById(R.id.text_color);
        String cinput;
        cinput = colourInputField.getText().toString();
        if(cinput.equals(""))
            cinput="white";

        try {
            Color.parseColor(cinput);
        } catch (IllegalArgumentException exception) {
            TextView errorMessage = findViewById(R.id.error_m);
            errorMessage.setVisibility(View.VISIBLE);
            return;
        }

            Intent intent = new Intent(this, Change_BG.class);
        intent.putExtra("colour", cinput);
        startActivity(intent);
    }


}
