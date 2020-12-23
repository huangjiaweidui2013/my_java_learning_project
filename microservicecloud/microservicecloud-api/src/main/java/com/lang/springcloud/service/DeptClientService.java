package com.lang.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lang.springcloud.entities.Dept;
/**
 * 
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
 *  新建  一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory
 * @ClassName: DeptClientService
 * @author HuangLang
 * @date 2020年12月7日 下午3:22:11
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT")
@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable(value = "id") Long id);
    
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list();
    
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) ;
    
    
}
