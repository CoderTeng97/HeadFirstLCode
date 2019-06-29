package com.tg.proxy.dynamic;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
    public static void main(String[] args){
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive(){
        PersonBean joe = getPersonBeanFromDB("Joe","男");//TODO 实例化一个对象
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling , Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("can't set rating from owner proxy");
        }

        PersonBean jack = getPersonBeanFromDB("Jack","男");//TODO 实例化一个对象
        PersonBean noneOwnerProxy = getNoneOwnerProxy(jack);
        noneOwnerProxy.setHotOrNotRating(10);
        System.out.println("HotOrNotRating is " + noneOwnerProxy.getHotOrNotRating());
        try {
            noneOwnerProxy.setInterests("bowling , Go");
        }catch (Exception e){
            System.out.println("can't set interests from nonwOwner proxy");
        }
    }

    public PersonBean getOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean)
                );
    }


    public PersonBean getNoneOwnerProxy(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NoneOwnerInvocationHandler(personBean)
        );
    }

    public PersonBean getPersonBeanFromDB(String name,String gender){
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName(name);
        personBean.setGender(gender);
        return personBean;
    }
}
