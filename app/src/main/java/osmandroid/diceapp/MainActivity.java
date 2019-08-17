package osmandroid.diceapp;

import android.support.v7.app.AppCompatActivity; //this import can be a bit different for you
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView dice;
    Button roll;

    int[] dices = {R.drawable.d1, R.drawable.d2, R.drawable.d3, R.drawable.d4, R.drawable.d5, R.drawable.d6};

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = findViewById(R.id.imgview);
        roll = findViewById(R.id.rollbtn);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x = getRandomNo();

                dice.setImageResource(dices[x]);
            }
        });

    }

    int getRandomNo()
    {
        return random.nextInt(6);
    }
}

