package cinema.client.web.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND,
        reason="Spittle Not Found")
public class ResourceNotFoundException extends RuntimeException {

}