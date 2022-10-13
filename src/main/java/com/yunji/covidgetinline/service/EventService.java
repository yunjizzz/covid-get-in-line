package com.yunji.covidgetinline.service;

import com.yunji.covidgetinline.constant.EventStatus;
import com.yunji.covidgetinline.domain.Event;
import com.yunji.covidgetinline.dto.EventDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 10. 6.
 */
public interface EventService {
    List<EventDTO> getEvents( Long eventId,
                               String eventName,
                               EventStatus eventStatus,
                               LocalDateTime eventStartDatetime,
                               LocalDateTime eventEndDatetime);


    public Optional<EventDTO> getEvent(Long eventId);

    public boolean createEvent(EventDTO eventDTO);

    public boolean modifyEvent(Long eventId, EventDTO eventDTO);

    public boolean removeEvent(Long eventId);
}
