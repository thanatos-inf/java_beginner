package OOPHW5;

public class DivModel extends CalcModel {

    public DivModel() {

    }
    @Override
    public Float result() {
        return x / y;
    }
    
    @Override
    public void setX(Float value) {
        super.x = value;        
    }

    @Override
    public void setY(Float value) {
        super.y = value;
        
    }
}
