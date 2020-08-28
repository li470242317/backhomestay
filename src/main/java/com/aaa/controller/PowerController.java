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
    public List<Map<String,Object>> selectName(Integer pos_id){
        //Relevance relevance=relevanceDao.SelectId(pow_id);
        List<Map<String,Object>> listone=powerDao.selectName(pos_id,0);
        for(Map<String,Object> one:listone){
            Integer power_ids=Integer.parseInt(one.get("pow_id").toString());
            List<Map<String,Object>> list=powerDao.selectName(pos_id,(Integer) one.get("pow_id"));
            one.put("childrenList",list);
        }
        return listone;
    }
    @RequestMapping("insert")
    @ResponseBody
    public Integer insert(Power power){
        int l=powerDao.insert(power);
        return l;
    }
    @RequestMapping("query")
    @ResponseBody
    public List<Map<String,Object>> query(){
        List<Map<String,Object>> listone=powerDao.power_query();
        //获取子级权限
        for(Map<String,Object> map:listone){
            //获取当前父级权限下的子级权限
            List<Map<String,Object>> listTwo=powerDao.power_twoQueryAll((Integer) map.get("pow_id"));
            map.put("listTwo",listTwo);
            map.put("twoLength",listTwo.size());
        }
        return listone;
    }
    @RequestMapping("update")
    @ResponseBody
    public Integer update(Power power){
        System.out.println(power);
        int t=powerDao.updateByPrimaryKey(power);
        System.out.println(t);
        return t;
    }
    @RequestMapping("delete")
    @ResponseBody
    public Integer delete(Integer pow_id){
        return powerDao.power_delete(pow_id);
    }
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Map<String,Object>> queryAll(){
        List<Map<String,Object>> oneList=powerDao.one_query();
        for(Map<String,Object> map:oneList){
            List<Map<String,Object>> twoList=powerDao.two_query((Integer) map.get("pow_id"));
            map.put("twoList",twoList);
            map.put("twoLeng",twoList.size());
        }
        return oneList;
    }

}
