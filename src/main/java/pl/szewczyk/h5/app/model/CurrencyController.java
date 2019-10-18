package pl.szewczyk.h5.app.model;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Controller
public class CurrencyController {


    public Currency currency;
    private RestTemplate restTemplate;

    public CurrencyController() {
        restTemplate = new RestTemplate();
    }

    @GetMapping("/currency")
    public String getCity(Model model) {
        currency = Currency.values()[new Random().nextInt(Currency.values().length)];
        model.addAttribute("currency", currency);
        return "CurrencyView";
    }

    @GetMapping("/answer")
    public String get(Model model, @RequestParam String answer) {
        model.addAttribute("answer", answer);
        model.addAttribute("result", getResult(answer));
        return "CurrencyAnswerView";
    }


    private Double getActualCurrency(String currency) {
        RestTemplate restTemplate = new RestTemplate();
        ActualCurrency actualCurrency = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=" + currency + "&symbols=PLN", ActualCurrency.class);
        Double cur = Double.parseDouble(actualCurrency.getRates().getPLN().toString());
        double roundedCurrency = Math.round(cur * 100.0) / 100.0;
        System.out.print("roundedCurrency" + roundedCurrency);
        return roundedCurrency;
    }

    private int getResult(String answer) {
        Double parseAnswer = Double.parseDouble(answer);
        double roundAnswer = Math.round(parseAnswer * 100.0) / 100.0;
        System.out.print("roundAnswer " + roundAnswer);

        Double result = getActualCurrency(currency.toString());
        if (result == roundAnswer) {
            //Udało się
            return 0;
        } else if (result < roundAnswer) {
            //Za dużo
            return -1;
        } else {
            //Za mało
            return 1;
        }
    }

}
