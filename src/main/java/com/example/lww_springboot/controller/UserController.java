package com.example.lww_springboot.controller;

import com.example.lww_springboot.entiy.ResponseBean;
import com.example.lww_springboot.entiy.User;
import com.example.lww_springboot.service.UserService;
import com.ramostear.captcha.HappyCaptcha;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@Slf4j
//@CrossOrigin(value = "http://localhost:8080",allowCredentials = "true")
public class UserController {
    @Value("${upload.imgurl}")
    private String imgUrl;
    @Value("${upload.imgweb}")
    private String imgweb;

    @Autowired
    UserService userService;

    /**
     * 实现登录
     * @param user 账号和密码
     * @return success
     */
        @RequestMapping("/login")
        @ResponseBody
        public ResponseBean login(@RequestBody User user, HttpServletRequest request){
            //1.校验验证码是否正确.false不一致，true一样 verification(请求，输入的验证码，是否忽略大小写)

//验证码判断
            boolean verification = HappyCaptcha.verification(request, user.getCode(), true);
//            if(!verification){
//                //返回响应Bean
//                return new ResponseBean(500,"验证码错误",null);
//            }


            //查询数据
            User userResult = userService.login(user);
            //判断是否为空
            if(userResult!=null){
                //存在
                request.getSession().setAttribute("user",userResult);
                //返回响应Bean
                return new ResponseBean(200,"登录成功",userResult);
            }else{
                //返回响应Bean
                return new ResponseBean(500,"用户名或密码错误",null);
            }
        }

        @RequestMapping("/updateUser")
        @ResponseBody
        public ResponseBean updateUser(@RequestBody User user){
            //调用service
            int row = userService.update(user);
            if(row>0){
                return new ResponseBean(200,"修改信息成功",null);
            }else{
                return new ResponseBean(500,"修改用户信息",null);
            }

        }

    /**
     * 获取文件element-ui取file
     * multipartFile.文件
     * @return
     */
    @RequestMapping("/uploadUserImg")
        @ResponseBody
        public ResponseBean uploadUserImg(@RequestParam("file")MultipartFile multipartFile,User user){
            //获取文件名
            String originalFilename = multipartFile.getOriginalFilename();
            //打印日志信息
            log.info("上传头像:"+originalFilename);
            //随机生成文件名
             String uuid=UUID.randomUUID().toString().replace("-","");
             //获取图片扩展名
            String extension = FilenameUtils.getExtension(originalFilename);
            //声明新的文件名
            String newFileName=uuid+"."+extension;
            //声明放置头像的目录
            File directory=new File(imgUrl+"user");
            //判断目录是否存在,如果不存在生成该目录
            if(!directory.exists()){
                directory.mkdir();
            }

        try {
            //开始存放
            multipartFile.transferTo(new File(directory,newFileName));
            //获取原本图片路径
            String headImgUrl=user.getHeadImg().replace(imgweb,imgUrl);
            //删除照片
            File file=new File(headImgUrl);
            file.delete();
            //打印日志
            log.info("原本存放的图片路径为"+headImgUrl);
            //新的图片网络路径
            String path=imgweb+"user/"+newFileName;
            return new ResponseBean(200,"上传头像成功",path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseBean(500,"上传头像失败",null);
        }
        
    }


}
