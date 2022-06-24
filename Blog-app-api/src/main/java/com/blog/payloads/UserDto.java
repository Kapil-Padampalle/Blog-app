package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty//notempty&notblank
	@Size(min=4,message="UserName must be min of 4 characters")
	private String name;
	
	@Email(message = "Email address is not valid")
	private String email;
	@NotEmpty
	//@Size(min=3,max=8,message="Password must be min of 3 chars and max of 8 chars")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", 
    message = "Invalid Password pattern. Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character."
    )
	private String password;
	
	@NotNull
	private String about;
	
}
