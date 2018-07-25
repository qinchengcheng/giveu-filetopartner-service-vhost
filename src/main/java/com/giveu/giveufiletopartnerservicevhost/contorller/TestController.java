package com.giveu.giveufiletopartnerservicevhost.contorller;

import com.giveu.giveufiletopartnerservicevhost.dao.FilePushFailMapper;
import com.giveu.giveufiletopartnerservicevhost.model.FilePushFail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class TestController {
    @Autowired
    FilePushFailMapper filePushFailMapper;
   @RequestMapping("/Hello")
    public String Hello(Model model)
    {
        FilePushFail filePushFail=filePushFailMapper.selectByPrimaryKey(new BigDecimal(328));
        model.addAttribute("id",filePushFail.getId());
        model.addAttribute("no",filePushFail.getContractNo());
        return "Hello";
    }
}
