package com.yunji.covidgetinline.config;

import com.yunji.covidgetinline.repository.EventRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 6.
 */
@Configuration
public class RepositoryConfig {

    @Bean
    public EventRepository eventRepository(){
        return new EventRepository(){};
    }
}
