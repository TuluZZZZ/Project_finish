package com.tms;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info=@Info(
                title = "Group 65 project",
                description = "This is pet project",
                contact = @Contact(
                        name="Tuluzova Lubov",
                        email ="ya.luba55555@ya.ru",
                        url="tuluzovalubow"

                )
        )

)
@SpringBootApplication
public class End65Application {

  //  static final Logger log = LoggerFactory(End65Application.class);


        public static void main (String[]args){
          //  log.info("INFO GOOD");
            SpringApplication.run(End65Application.class, args);
        }
    }