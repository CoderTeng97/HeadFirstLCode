package com.tg.proxy.remote;

public class NoQuarterState implements State{
    /**
     * transient 对于State的每个实现，我们都在实例GumballMachine前面加上 transient关键字，这样就告诉JVM 不要序列化这个字段
     */
    transient GumballMachineRemote gumballMachine;
    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
