package com.derya.sbes.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.derya.sbes.dto.UserDto;
import com.derya.sbes.entity.User;
import com.derya.sbes.services.UserService;
import com.derya.sbes.util.CustomPage;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping("/create")
	public ResponseEntity<UserDto>createUser(@RequestBody UserDto userDto){  //json nesnesini user class larinda eslemeyi saglar
		UserDto resultUser = userService.createUser(userDto);
		return ResponseEntity.ok(resultUser);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserDto>> getUsers(){
		List<UserDto> users= userService.getUsers();
		return ResponseEntity.ok(users);
		
	}
	@GetMapping("/getById/{id}")
	public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id){
		//url den id yi alir degiskene atar
		UserDto user = userService.getUser(id);	
		return ResponseEntity.ok(user);
	}
	@PutMapping("/edit/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long id, @RequestBody UserDto user){  //gelen json nesnesinin java class ina esitlenmesi
		UserDto resultUser = userService.updateUser(id, user);
		return ResponseEntity.ok(resultUser);
		
	}
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable("id")Long id){
		Boolean status = userService.deleteUser(id);
		return ResponseEntity.ok(status);
	}
	@GetMapping("/pagination")
	public ResponseEntity<Page<User>>pagination(@RequestParam int currentPage,@RequestParam  int pageSize){
		return ResponseEntity.ok(userService.pagination(currentPage, pageSize));
	}
	@GetMapping("/pagination/v1")
	public ResponseEntity<Page<User>>pagination(Pageable pageable){
		return ResponseEntity.ok(userService.pagination(pageable));
	}
	@GetMapping("/pagination/v2")
	public ResponseEntity<Slice<User>> slice(Pageable pageable){
		return ResponseEntity.ok(userService.slice(pageable));
	}
	@GetMapping("/pagination/v3")
	public ResponseEntity<CustomPage<UserDto>> customPagination(Pageable pageable){
		return ResponseEntity.ok(userService.customPagination(pageable));
	}
}
