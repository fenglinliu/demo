package cn.bookcycle.demo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
@Api
public class DemoController {
	
	@ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
	@ApiImplicitParams(value = 
	{ @ApiImplicitParam(name = "body", value = "请求体", dataType = "String", paramType = "path"),
	@ApiImplicitParam(name = "para", value = "参数", required = true, dataType = "String", paramType = "path")
	}
	)
	@ApiResponses(value = { @ApiResponse(code = 0, message = "No Name Provided")})
	@ResponseBody
	@RequestMapping(value = "/pay", method = RequestMethod.POST)
	public  String say(@RequestBody (required=false) String body) {
		if (body != null)
		System.out.println(body);
		else 
			System.out.println("12341251234");
		return "Hello Spring Boot!";
	}
	
}
