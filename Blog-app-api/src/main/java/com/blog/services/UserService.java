package com.blog.services;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {
	
   UserDto	createUser(UserDto userDto);
   
   UserDto upadteUser(UserDto user,Integer userId);
   
    UserDto getUserById(Integer userId);
    
    List<UserDto>  getAllUsers();
    
    void deleteUser(Integer userId);

}
