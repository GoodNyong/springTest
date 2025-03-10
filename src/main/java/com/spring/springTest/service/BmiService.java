package com.spring.springTest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.springTest.vo.BmiVo;

@Service
public class BmiService {
	private List<BmiVo> bmiList = new ArrayList<>();

    public BmiService() {
        loadInitialData();
    }

    // XML에서 데이터 불러오기
    private void loadInitialData() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:xml/grade.xml");
        BmiVo user1 = ctx.getBean("bmiUser1", BmiVo.class);
        BmiVo user2 = ctx.getBean("bmiUser2", BmiVo.class);
        ctx.close();

        bmiList.add(user1);
        bmiList.add(user2);
    }

    public List<BmiVo> getBmiList() {
        return bmiList;
    }

    public void addBmiData(String name, double height, double weight) {
        BmiVo newUser = new BmiVo(name, height, weight);
        bmiList.add(newUser);
    }
}
