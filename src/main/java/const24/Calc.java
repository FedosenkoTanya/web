package const24;

public class Calc {

    public String setDate(String date) {
        return new Reader().readFromApi(date);
    }
}
