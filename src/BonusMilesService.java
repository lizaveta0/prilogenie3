public class BonusMilesService {
    public int calculate(int price, int miles) {
        int resalt;
        if (price > miles) {
            resalt = price;
        } else {
            resalt = miles;
        }
        return resalt;
    }

    public int calculate(int price) {
        return price;
    }
}
