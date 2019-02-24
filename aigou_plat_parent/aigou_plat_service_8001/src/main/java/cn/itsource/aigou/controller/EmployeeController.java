package cn.itsource.aigou.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return new AjaxResult();
        }else{
            AjaxResult ajaxResult = AjaxResult.getMe().setSuccess(false).setMsg("密码错误或用户不存在");
            return ajaxResult;
        }

    }
}
