package com.aaa.controller;

import com.aaa.dao.FunctionsDao;
import com.aaa.dao.PowerDao;
import com.aaa.dao.RelevanceDao;
import com.aaa.entity.Account;
import com.aaa.entity.Power;
import com.aaa.entity.Relevance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("power")
public class PowerController {
    @Resource
    PowerDao powerDao;
    @Resource
    RelevanceDao relevanceDao;
    @RequestMapping("SelectName")
    @ResponseBody
    public List<Map<String,Object>> selectName(@RequestBody Account account){
        Relevance relevance=relevanceDao.SelectId(account.getAcc_id());
        List<Map<String,Object>> listone=powerDao.selectName(relevance.getPos_id(),0);
        for(Map<String,Object> one:listone){
            Integer power_ids=Integer.parseInt(one.get("pow_id").toString());
            List<Map<String,Object>> list=powerDao.selectName(relevance.getPos_id(),power_ids);
            one.put("childrenList",list);
        }
        return listone;
    }
}
