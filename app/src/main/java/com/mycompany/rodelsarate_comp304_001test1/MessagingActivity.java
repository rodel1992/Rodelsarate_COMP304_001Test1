package com.mycompany.rodelsarate_comp304_001test1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MessagingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messaging);

        Intent intent = getIntent();
        this.setTitle(intent.getStringExtra("name"));

        Bitmap bitmap;
        Canvas canvas;
        Paint paint;
        ImageView imageView = (ImageView) findViewById(R.id.diagonal);

        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);

        bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);

        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(View.VISIBLE);
        imageView.setBackgroundColor(Color.LTGRAY);
        canvas.drawLine(0,0,300,300, paint);
        canvas.drawLine(200,0,0,200, paint);



    }

    public void send(View view){
        EditText editText = (EditText) findViewById(R.id.message);

        Toast.makeText(MessagingActivity.this, "Message: " + editText.getText(), Toast.LENGTH_LONG).show();
    }
}
