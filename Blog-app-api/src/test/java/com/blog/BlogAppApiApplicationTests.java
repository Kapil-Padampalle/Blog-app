package com.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApiApplicationTests {
	
     @Autowired
    private UserRepo userRepo;
	
	@Test
	void contextLoads() {
	}

	// How we autowired Interface???..
	@Test
	public void repoTest() {
		
		//jdk.proxy2.$Proxy100 -->userRepo Implementation class obj in runtime by spring conatiner..

      String className = this.userRepo.getClass().getName();   
     // String packageName = this.userRepo.getClass().getPackageName();
       
      System.out.println(className);
     // System.out.println(packageName);
	}

}
