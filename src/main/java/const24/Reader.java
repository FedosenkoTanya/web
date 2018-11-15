package const24;

import globalmarket.model.Currency;
import globalmarket.model.Money;
import globalmarket.service.CurrencyService;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reader {

    public String readFromApi(String date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate localDate = LocalDate.parse(date, formatter);

        //получаем абсолютный путь текущей дирректории
        String currentFilePath = Paths.get("").toAbsolutePath().toString();

        //создаем сервис по работе с валютой
        CurrencyService currencyService = new CurrencyService(currentFilePath);

        Money myMoney = new Money(1, Currency.USD);


        try {
            //конвертируем деньги в другую валюту
            Money exchangedMoney = currencyService.exchangeMoneyСurrencyByDate(myMoney, Currency.RUB, localDate);
            Money exchangedMoney1 = currencyService.exchangeMoneyСurrencyByDate(myMoney, Currency.EUR, localDate);
            return "" + exchangedMoney.getValue()+exchangedMoney1.getValue();
        }
        catch (Throwable exchangeMoney){
            return "---";
        }



    }
}
