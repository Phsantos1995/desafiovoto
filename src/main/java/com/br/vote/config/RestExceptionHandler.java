package com.br.vote.config;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.br.vote.exception.ErrorMessage;


import java.time.LocalDateTime;

public class RestExceptionHandler {


    public ResponseEntity< ErrorMessage > handle( Exception ex, HttpStatus statusCode,
                                                  String desciption ) {
        ErrorMessage message = new ErrorMessage( statusCode, LocalDateTime.now( ), ex.getMessage( ),
                desciption );
        ex.printStackTrace( );
        return new ResponseEntity<>( message, message.getStatusCode( ) );
    }

}
