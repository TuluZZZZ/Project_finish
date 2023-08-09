package com.tms.controller;

import com.tms.model.Role;
import com.tms.model.UserInfo;
import com.tms.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@DisplayName("Наш класс")
public class UserControllerTest {
    @MockBean
    UserService userService;
   static UserInfo userInfo;

    @BeforeAll
    public static void beforAll(){
        userInfo=new UserInfo();
        userInfo.setId(10);
        userInfo.setFirstName("Dima");
        userInfo.setLastName("Gorohov");
        userInfo.setRole(Role.USER);

    }


    @Test
        public void getUserTest(){
        int userId=10;
        Mockito.when(userService.getUser(anyInt()).thenReturn(userInfo));
mockMvc.perform(getUserTest();)
    }

}
