package com.yunji.covidgetinline.controller.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * description
 * <p>
 * author         : yunji
 * date           : 22. 9. 29.
 */
@WebMvcTest(APIPlaceController.class)
class APIPlaceControllerTest {
    @Autowired
    MockMvc mvc;

    @DisplayName("API 장소 요청")
    @Test
    void testError() throws Exception {
        //given

        //when & then
        mvc.perform(get("/wrong_url"))
                .andExpect(status().isNotFound())
                .andDo(print());
    }
}