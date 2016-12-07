package jioch.com.patternapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //object creation
        ShapeFactory shapeFactory = new ShapeFactory();
        //method call bye getting circle class object
        Shape myShape1 = shapeFactory.getShape("CIRCLE");
        type = myShape1.draw();
        Toast.makeText(this, type, Toast.LENGTH_SHORT).show();
        //method call bye getting Rectangle class object
        Shape myShape2 = shapeFactory.getShape("RECTANGLE");
        type = myShape2.draw();
        Toast.makeText(this, type, Toast.LENGTH_SHORT).show();
    }
}
