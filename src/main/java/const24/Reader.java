package const24;

public class Reader {

    public String readFromApi(String date) {
        switch (date) {
            case "13.11.2018":
                return "100";
            case "14.11.2018":
                return "1000";
            case "15.11.2018":
                return "10000";
            default:
                return "1";
        }
    }
}
