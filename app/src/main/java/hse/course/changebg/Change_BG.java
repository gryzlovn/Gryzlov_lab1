package hse.course.changebg;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Change_BG extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.change_bg);

        Intent intent = getIntent();
        String colour = intent.getStringExtra("colour");

        ConstraintLayout constraintLayout = findViewById(R.id.layout);
        constraintLayout.setBackgroundColor(Color.parseColor(colour));
    }
}