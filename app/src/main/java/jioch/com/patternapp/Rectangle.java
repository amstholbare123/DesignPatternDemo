package jioch.com.patternapp;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by amol on 7/12/16.
 */
public class Rectangle extends Activity implements Shape {
    static String type="Rectangle";
    @Override
    public String draw() {
        System.out.print("This is Rectangle");
        return  type;
    }
}
