package Demo;

import java.util.Objects;

class lap {

    String model;
    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.model);
        hash = 79 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final lap other = (lap) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lap{");
        sb.append("model=").append(model);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

public class toStringHashcode {
    public static void main(String[] args) {
        lap obj = new lap();
        obj.model = "Lenovo";
        obj.price = 1000;

        lap obj1 = new lap();
        obj1.model = "Lenovo";
        obj1.price = 1000;

        boolean result = obj.equals(obj1);

        System.out.println(result);

    }

}
