package sanchez.ripplecoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    RippleBackground rippleBackground;
    ImageView centerImage, spotconImage;
    Animation spotconanim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rippleBackground = (RippleBackground) findViewById(R.id.content);
        centerImage = (ImageView) findViewById(R.id.centerImage);
        spotconImage = (ImageView) findViewById(R.id.spotcon);

        spotconanim = AnimationUtils.loadAnimation(this, R.anim.spotconanim);
        spotconImage.startAnimation(spotconanim);

        centerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rippleBackground.startRippleAnimation();
            }
        });
    }
}
