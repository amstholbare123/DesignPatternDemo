package jioch.com.patternapp;

/**
 * Created by amol on 7/12/16.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType==null){
            return  null;
        }
        else  if(shapeType.equalsIgnoreCase("CIRCLE")){
            return  new Circle();
        }
        else  if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return  new Rectangle();
        }
        return null;
    }
}
