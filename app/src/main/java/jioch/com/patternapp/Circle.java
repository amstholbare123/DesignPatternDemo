package jioch.com.patternapp;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by amol on 7/12/16.
 */
public class Circle  implements Shape {
    static String type="Circle";
    @Override
    public String draw() {
       System.out.print("This is Circle");
        return  type;
    }
}
