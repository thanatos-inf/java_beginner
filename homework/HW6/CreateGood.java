package HW6;

public class CreateGood {
    Good temp;
    public CreateGood() {
        temp = new Good();
        temp.name = CONST.EMPTY;
        temp.price = CONST.NULL_VALUE;
        temp.count = CONST.NULL_VALUE;
        temp.description = CONST.EMPTY;        
    }

    public CreateGood setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateGood setPrice(Double price) {
        temp.price = price;
        return this;
    }

    public CreateGood setCount(int count) {
        temp.count = count;
        return this;
    }

    public CreateGood setDescription(String description) {
        temp.description = description;
        return this;
    }

    public Good Create() {
        return temp;
    }
}
