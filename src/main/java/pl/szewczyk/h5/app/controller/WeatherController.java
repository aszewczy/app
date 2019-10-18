package pl.szewczyk.h5.app.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.szewczyk.h5.app.model.WeatherForCity;

/*
Połącz się z serwisem pogodowym i stwórz widok, który umożliwia na wprowadzanie miasta do pola tekstowego miasta.
Po zatwierdzeniu przyciskiem wyświetli się aktualna pogoda dla danej miejscowości wraz z odzwierciedlającą pogodę grafiką.
*/


@Controller
public class WeatherController {


    @Value("${api-openweathermap.url}")
    private String url;
    @Value("${api-openweathermap.appid}")
    private String appid;

    private String city;

    private RestTemplate restTemplate;

    public WeatherController() {
        restTemplate = new RestTemplate();
    }


    private WeatherForCity getWeatherForCity(String city) {
        WeatherForCity weather = new WeatherForCity();
        weather = restTemplate.getForObject(url + city + "&appid=" + appid, WeatherForCity.class);
        String iconName = weather.getWeather().get(0).getIcon();
        String iconUrl =  "http://openweathermap.org/img/w/" + iconName + ".png";
        weather.getWeather().get(0).setSrc(iconUrl);
        return weather;
    }

    @GetMapping("/result")
    public String get(Model model, @RequestParam String city) {
        model.addAttribute("weather", getWeatherForCity(city));
        return "ResultWeatherView";
    }



    @GetMapping("/weather")
    public String getCity(Model model) {
        return "WeatherView";
    }


}
