package com.lang.springcloud.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * Dept (Entity) orm mysql -> Dept (table) 类表关系映射 必须序列化
 * @ClassName: Dept
 * @author HuangLang
 * @date 2020年11月27日 下午6:04:36
 */
@SuppressWarnings("serial")
//@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
    private Long    deptno; // 主键
    private String  dname; // 部门名称
    private String  db_source;// 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    
    public Dept(String dname) {
        super();
        this.dname = dname;
    }
    
//    public static void main(String[] args) {
//        Dept dept = new Dept();
//        dept.setDeptno(10L).setDname("4556").setDb_source("DB123");
//    }
}
