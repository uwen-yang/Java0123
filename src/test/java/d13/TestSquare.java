package d13;

import com.pcschool.ocp.d13_assert.Square;



public class TestSquare {

    private Object Assert;
   
    public void test1() {
        int x = 10;
        int y = 20;
        int h = 4;
        int exp = 60;
        Square sq = new Square();
        int act = sq.getArea(x, y, h);
        
       
    }
}
