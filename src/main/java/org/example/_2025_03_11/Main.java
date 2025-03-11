package org.example._2025_03_11;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        System.out.println(season == Season.SPRING);

        System.out.println(SeasonConstants.WINTER);
        System.out.println(SeasonConstants.SUMMER);
        System.out.println(SeasonConstants.SPRING);
        System.out.println(SeasonConstants.FALL);

        String[] seasonConstats = {SeasonConstants.FALL, SeasonConstants.SUMMER, SeasonConstants.SPRING, SeasonConstants.WINTER};

        Season[] seasons = Season.values();

        for (Season s : Season.values()) {
            System.out.println(s);
        }

        Season season1 = Season.valueOf("WINTER");
/*        Season season2 = Enum.valueOf(Season.class, "WINTER");*/
        System.out.println(season1);

        System.out.println(Season.WINTER.name());
        System.out.println(Season.WINTER.ordinal());

        BadYear badYear = new BadYear();
        badYear.addSeason(SeasonConstants.WINTER);
        badYear.addSeason(SeasonConstants.SPRING);
        badYear.addSeason(SeasonConstants.SUMMER);
        badYear.addSeason(SeasonConstants.FALL);
        badYear.addSeason("ALOHA");
        badYear.addSeason("asdg");
        badYear.addSeason("ALOfdgbdfHA");
        badYear.addSeason("ALOasdfaweHA");

        GoodYear goodYear = new GoodYear();
        goodYear.addSeason(Season.WINTER);
        goodYear.addSeason(Season.SPRING);
        goodYear.addSeason(Season.SUMMER);
        goodYear.addSeason(Season.FALL);

        System.out.println(badYear);
        System.out.println(goodYear);

        //------------------------------------//

        for (Country country : Country.values()) {
            if (country.getCurrency() == null) {
                country.setCurrency(getCurrency());
            }
            System.out.println(country.name());
            country.sayHello();
            /*System.out.println(country.name() + " this is country name");
            System.out.println(country.getCurrency() + " this is country currency");*/
        }
    }

    private static String getCurrency() {
        //some random currency
        return "not null";
    }
}
