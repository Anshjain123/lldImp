package StructuralDesginPattern.adapter;

public interface SocketVoltageAdapter {

    public Voltage get120VoltFromSocket();
    public Voltage get240VoltFromSocket();
    public Voltage get60VoltFromSocket();
    public Voltage get3VoltFromSocket();

}
