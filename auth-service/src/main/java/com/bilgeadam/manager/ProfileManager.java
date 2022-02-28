package com.bilgeadam.manager;

import static com.bilgeadam.constant.RestApiUrls.*;

import com.bilgeadam.dto.request.ProfileRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



/**
 * Microsercive mimarisi ile kullanılan yapılarda. adresler değişebilir.
 * localhost:8091/ v1
 * Bu nedenle istek atılacak microsevice ler farklı adresler de olabilir. test ya da geliştirme ortamları farklı olabilir
 * bunu yönetbilmek adına URL bilgisi application.yml üzerinden alınmalıdır.
 */
@FeignClient(url = "${myapplication.userservice}"+ VERSION+PROFILE, name = "profileFeignClient", decode404 = true)
public interface ProfileManager {

    @PostMapping(SAVE)
    public ResponseEntity<String> save(@RequestBody ProfileRequestDto dto);

}