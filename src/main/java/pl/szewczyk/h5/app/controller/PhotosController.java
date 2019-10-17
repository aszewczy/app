package pl.szewczyk.h5.app.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import pl.szewczyk.h5.app.model.FindParams;
import pl.szewczyk.h5.app.model.Photo;

import java.util.Arrays;
import java.util.List;

/*
Wybierz usługę, która zwraca kolekcje. Możesz użyć, któregoś z tych serwisów:
https://github.com/public-apis/public-apis
Następnie skomunikuj się z usługą poprzez wykorzystanie klasy RestTemplate.
Z wykorzystaniem swojego ulubionego narzędzia do tworzenia GUI wyświetl wszystkie dane we formie tabelarycznej.
*/


@Controller
@SessionAttributes
public class PhotosController {


    private RestTemplate restTemplate;

    public PhotosController() {
        restTemplate = new RestTemplate();
    }

    private List<Photo> getPhotos(int page, int limit) {

        String url = "https://picsum.photos/v2/list";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");


        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("page", page)
                .queryParam("limit", limit);

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<Photo[]> exhange = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, entity, Photo[].class);

        //   Stream.of(exhange.getBody()).forEach(System.out::println);

        List<Photo> photos = Arrays.asList(exhange.getBody());

        return photos;
    }


    @GetMapping("/photos")
    public String get(Model model) {
        List<Photo> photos = getPhotos(1, 1);
        model.addAttribute("photos", photos);
        model.addAttribute("params", new FindParams());
        return "PhotosView";
    }

    @RequestMapping("/find")
    public String find(FindParams params, Model model) {
        FindParams fp = new FindParams();
        fp.setPage(params.getPage());
        fp.setLimit(params.getLimit());
        model.addAttribute("params", fp);
        List<Photo> photos = getPhotos(fp.getPage(), fp.getLimit());
        model.addAttribute("photos", photos);

        return "PhotosView";
    }


}
