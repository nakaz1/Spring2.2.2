package web.model;

public class Car {
    String model;
    int series;
    int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

}
